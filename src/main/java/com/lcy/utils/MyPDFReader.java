package com.lcy.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.lcy.pojo.BalanceSheet;
import com.lcy.pojo.CashFlowStatement;
import com.lcy.pojo.IncomeStatement;

public class MyPDFReader {

    public static final int BalanceSheet = 1;
    public static final int CashFlowStatement = 2;
    public static final int IncomeStatement = 3;

    private final String contentText;
    private final String balanceSheetText;
    private final String cashFlowStatementText;
    private final String incomeStatementText;

    public MyPDFReader(String pdfFilePath) {
        this.contentText = getTextFromPDF(pdfFilePath);
        this.balanceSheetText = MyRegUtils.parseOne("合并资产负债表[\\.\\w\\W]+?母公司资产负债表", contentText);
        this.cashFlowStatementText = MyRegUtils.parseOne("合并现金流量表[\\.\\w\\W]+?母公司现金流量表", contentText);
        this.incomeStatementText = MyRegUtils.parseOne("合并利润表[\\.\\w\\W]+?母公司利润表", contentText);
    }

    /**
     * 将PDF文件转换为String字符串
     *
     * @param pdfFilePath PDF文件所在地址
     * @return
     */
    public static String getTextFromPDF(String pdfFilePath) {
        String result = null;
        PDDocument document = null;
        try {
            document = PDDocument.load(new File(pdfFilePath));
            PDFTextStripper stripper = new PDFTextStripper();
            result = stripper.getText(document);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                try {
                    document.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    public String getCashFlowStatementText() {
        return cashFlowStatementText;
    }

    /**
     * 从PDF中读取资产负债表
     *
     * @return 资产负债表对象
     */
    public BalanceSheet getBalanceSheetFromPdf() {
        Map<String, String> balanceSheetMap = StatementMap.getBalanceSheetMap();
        BalanceSheet balanceSheet = new BalanceSheet();
        Class<?> balanceSheetClass;
        try {
            balanceSheetClass = balanceSheet.getClass();
            String temp;
            for (String item : balanceSheetMap.keySet()) {
                Method method = balanceSheetClass.getDeclaredMethod(balanceSheetMap.get(item), String.class);
                method.setAccessible(true);
                temp = getItemText(item, MyPDFReader.BalanceSheet);
                method.invoke(balanceSheet, temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return balanceSheet;
    }

    /**
     * 从PDF中读取现金流量表
     *
     * @return 现金流量表对象
     */
    public CashFlowStatement getCashFlowStatementFromPdf() {
        CashFlowStatement cashFlowStatement = new CashFlowStatement();
        Map<String, String> cashFlowStatementMap = StatementMap.getCashFlowStatementMap();
        Class<?> cashFlowStatementClass;
        try {
            cashFlowStatementClass = cashFlowStatement.getClass();
            String temp;
            for (String item : cashFlowStatementMap.keySet()) {
                Method method = cashFlowStatementClass.getDeclaredMethod(cashFlowStatementMap.get(item), String.class);
                method.setAccessible(true);
                temp = getItemText(item, MyPDFReader.CashFlowStatement);
                method.invoke(cashFlowStatement, temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cashFlowStatement;
    }

    /**
     * 从PDF中读取利润表
     *
     * @return 利润表对象
     */
    public IncomeStatement getIncomeStatementFromPdf() {
        Map<String, String> incomeStatementMap = StatementMap.getIncomeStatementMap();
        IncomeStatement incomeStatement = new IncomeStatement();
        Class<?> incomeStatementClass;
        try {
            incomeStatementClass = incomeStatement.getClass();
            String temp;
            for (String item : incomeStatementMap.keySet()) {
                Method method = incomeStatementClass.getDeclaredMethod(incomeStatementMap.get(item), String.class);
                method.setAccessible(true);
                temp = getItemText(item, MyPDFReader.IncomeStatement);
                method.invoke(incomeStatement, temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return incomeStatement;
    }

    /**
     * 获取财报范围文本
     *
     * @return
     */
    public String getItemText(String item, int index) {
        String mainText = null;
        if (index == MyPDFReader.BalanceSheet) {
            mainText = balanceSheetText;
        } else if (index == MyPDFReader.CashFlowStatement) {
            mainText = cashFlowStatementText;
        } else if (index == MyPDFReader.IncomeStatement) {
            mainText = incomeStatementText;
        }
        if (mainText == null) {
            throw new RuntimeException("Didn't find the scop of financial statement!");
        }
        String itemText = null;
        String targetRow = MyRegUtils.parseOne(item + ".+", mainText);
        if (targetRow != null) {
            String[] target = targetRow.split(" ");
            for (String s : target) {
                if (MyRegUtils.parseOne("[0-9,.]{3,}", s) != null) {
                    itemText = s;
                    break;
                }
            }
        }
        return itemText;
    }

    /**
     * 将PDF转换为txt
     *
     * @param descPath 目标路径
     */
    public void pdfToTextfile(String descPath) {
        try {
            FileUtils.writeStringToFile(new File(descPath), contentText, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
