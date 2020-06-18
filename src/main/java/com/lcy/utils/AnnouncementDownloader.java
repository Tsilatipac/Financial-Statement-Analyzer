package com.lcy.utils;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import com.alibaba.fastjson.JSONObject;
import com.lcy.pojo.Announcements;
import com.lcy.pojo.JsonRootBean;

/**
 * 年报下载工具
 *
 * @author Tsilatipac
 */
public class AnnouncementDownloader {

    /**
     * 入口方法
     * 遍历代码，使用多线程下载
     *
     * @param codes 存放要查询的股票代码的集合
     */
    public static void downloadByStockCode(List<String> codes) {
        for (String code : codes) {
            new Thread(() -> parseAndDownload(code)).start();
        }
    }

    /**
     * 查询和分析股票的年报的Json，调用下载方法
     *
     * @param stockCode 股票代码
     */
    public static void parseAndDownload(String stockCode) {
        // 获取股票代码
        // String stockCode = "603288";
        final int pageSize = 30;
        String reg = "年年度报告$";
        Pattern pattern = Pattern.compile(reg);

        // 调用queryFromWeb查询
        String result = queryFromWeb(stockCode, pageSize + "", "1");

        //将获取的Json转换为对象
        JsonRootBean jsonRootBean = JSONObject.parseObject(result, JsonRootBean.class);

        // total 为总记录条数
        int total = jsonRootBean.getTotalAnnouncement();

        // announcementsList 存放获取到的记录
        List<Announcements> announcementsList = jsonRootBean.getAnnouncements();
        for (int i = 2; i <= total / pageSize + 1; i++) {
            result = queryFromWeb(stockCode, pageSize + "", i + "");
//            try {
                announcementsList.addAll(JSONObject.parseObject(result, JsonRootBean.class).getAnnouncements());
//            } catch (Exception e) {
//                System.out.println("stockCode---->"+stockCode);
//                System.out.println("result---->"+result);
//                e.printStackTrace();
//            }
        }

        System.out.println("已获取:" + total + "/" + announcementsList.size());

        // 处理获取到的记录
        Matcher matcher;
        for (Announcements announcements : announcementsList) {
            matcher = pattern.matcher(announcements.getAnnouncementTitle());
            if (matcher.find()) {
                new Thread(() -> downloadAnnouncement(announcements)).start();
            }
        }
    }

    /**
     * 从网站下载数据，存放在本地的docs文件夹
     *
     * @param announcements 下载数据所在的对象
     */
    public static void downloadAnnouncement(Announcements announcements) {
        String adjunctUrl = announcements.getAdjunctUrl();
        String adjunctType = announcements.getAdjunctType();
        String announcementTitle = announcements.getAnnouncementTitle();
        String code = announcements.getSecName();
        try {
            URL url = new URL("http://static.cninfo.com.cn/" + adjunctUrl);
            String fileType = "pdf".equals(adjunctType) ? ".pdf" : adjunctUrl.substring(adjunctUrl.lastIndexOf("."));
            File file = new File(System.getProperty("user.dir") + "/docs/" + code + "/" + announcementTitle + fileType);
            System.out.println("Downloading: [" + announcementTitle + "] from " + url);
            FileUtils.copyURLToFile(url, file);
            System.out.println("Downloaded: [" + announcementTitle + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 传入参数并调用Ajax.getAccesstoken方法，从网站获取Json
     *
     * @param stockCode 股票代码
     * @param pageSize  每页大小
     * @param pageNum   页码
     * @return
     */
    public static String queryFromWeb(String stockCode, String pageSize, String pageNum) {
        String url = "http://www.cninfo.com.cn/new/hisAnnouncement/query";
        String column;
        String plate;
        if (stockCode.startsWith("00") || stockCode.startsWith("30")) {
            column = "szse";
            plate = "sz";
        } else if (stockCode.startsWith("60") || stockCode.startsWith("68")) {
            column = "sse";
            plate = "sh";
        } else {
            throw new RuntimeException("股票代码不支持");
        }
        Map<String, String> data = new HashMap<>();
        stockCode = stockCode + "," + searchOrgId(stockCode);
        data.put("stock", stockCode);
        data.put("tabName", "fulltext");
        data.put("pageSize", pageSize);
        data.put("pageNum", pageNum);
        data.put("column", column);
        data.put("plate", plate);
        data.put("category", "category_ndbg_szsh;category_bndbg_szsh;category_yjdbg_szsh;category_sjdbg_szsh;");
        data.put("isHLtitle", "true");
        //        for (String key : data.keySet()) {
//            System.out.println(key + " ---> " + data.get(key));
//        }
        return Ajax.getAccesstoken(url, data);
    }

    /**
     * 根据股票代码查询组织id
     *
     * @param stockCode 股票代码
     * @return
     */
    public static String searchOrgId(String stockCode) {
        String url = "http://www.cninfo.com.cn/new/fulltextSearch/full";
        HashMap<String, String> queryMap = new HashMap<>();
        queryMap.put("searchkey", stockCode);
        queryMap.put("isfulltext", "false");
        queryMap.put("sortName", "pubdate");
        queryMap.put("sortType", "desc");
        queryMap.put("pageNum", "1");
        String result = Ajax.getMap(url, queryMap);
        String orgId = MyRegUtils.parseOne("\"secCode\":\"" + stockCode + "\".+?\"orgId\":\"[\\da-zA-z]+\"", result);
        assert orgId != null;
        String[] split = orgId.split(":");
        return split[split.length - 1].replace("\"", "");
    }
}
