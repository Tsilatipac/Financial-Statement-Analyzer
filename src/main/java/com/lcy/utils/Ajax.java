package com.lcy.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Ajax {

    /**
     * 只需要改一个url 和 data 参数  后面都不变都是固定的
     */
    public static String getAccessToken(String url, Map<String, String> data) {
        String result = null;
        // 请求地址
//		String url = "http://www.cninfo.com.cn/new/hisAnnouncement/query";
        //以集合的方式传递值
        List<NameValuePair> parameForToken = new ArrayList<>();
        //data参数

//		stock: 600519,gssh0600519
//		tabName: fulltext
//		pageSize: 30
//		pageNum: 1
//		column: sse
//		category: category_ndbg_szsh;category_bndbg_szsh;category_yjdbg_szsh;category_sjdbg_szsh;
//		plate: sh
//		seDate
//		searchkey
//		secid
//		sortName
//		sortType
//		isHLtitle: true
//		parameForToken.add(new BasicNameValuePair("stock", "600519,gssh0600519"));
//		parameForToken.add(new BasicNameValuePair("tabName", "fulltext"));
//		parameForToken.add(new BasicNameValuePair("pageSize", "30"));
//		parameForToken.add(new BasicNameValuePair("pageNum", "1"));
//		parameForToken.add(new BasicNameValuePair("column", "sse"));
//		parameForToken.add(new BasicNameValuePair("category", "category_ndbg_szsh;category_bndbg_szsh;category_yjdbg_szsh;category_sjdbg_szsh;"));
//		parameForToken.add(new BasicNameValuePair("plate", "sh"));
//		parameForToken.add(new BasicNameValuePair("isHLtitle", "true"));

        for (String key : data.keySet()) {
            parameForToken.add(new BasicNameValuePair(key, data.get(key)));
        }

        // 获取httpclient
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            // 创建post请求
            HttpPost httpPost = new HttpPost(url);
            // 设置请求和传输超时时间
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
            httpPost.setConfig(requestConfig);

            // 提交参数发送请求
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(parameForToken);
            httpPost.setEntity(urlEncodedFormEntity);
            response = httpclient.execute(httpPost);
            // 得到响应信息
            int statusCode = response.getStatusLine().getStatusCode();
            // 判断响应信息是否正确
            if (statusCode != HttpStatus.SC_OK) {
                // 终止并抛出异常
                httpPost.abort();
                throw new RuntimeException("HttpClient,error status code :" + statusCode);
            }
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // result = EntityUtils.toString(entity);//不进行编码设置
                result = EntityUtils.toString(entity, "UTF-8");
            }
            EntityUtils.consume(entity);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭所有资源连接
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpclient != null) {
                try {
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//		String access=JSONObject.parseObject(JSONObject.parseObject(result).getString("data")).getString("accessToken");
        return result;
    }
}