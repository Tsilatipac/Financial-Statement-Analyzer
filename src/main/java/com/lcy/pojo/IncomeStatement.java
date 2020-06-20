package com.lcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatement {
    // 股票代码
    private String stockCode;
    // 年份
    private String year;
    // 营业总收入
    private String totalOperatingIncome;
    // 营业收入
    private String operatingIncome;
    // 营业总成本
    private String totalOperatingCosts;
    // 营业成本
    private String operatingCosts;
    // 税金及附加
    private String businessTaxesAndSurcharges;
    // 销售费用
    private String sellingExpenses;
    // 管理费用
    private String administrativeExpenses;
    // 研发费用
    private String researchAndDevelopmentExpenses;
    // 财务费用
    private String financialExpenses;
    // 资产减值损失
    private String impairmentLoss;
    // 营业利润
    private String operatingProfit;
    // 营业外收入
    private String nonOperatingIncome;
    // 营业外支出
    private String nonOperatingExpenses;
    // 利润总额
    private String totalProfit;
    // 所得税费用
    private String incomeTaxExpenses;
    // 净利润
    private String netProfit;
    // 持续经营净利润
    private String netProfitOnContinuousOperation;
    // 终止经营净利润
    private String netLossOnTerminatedOperation;
    // 归属于母公司所有者的净利润
    private String profitOrOossAttributableToMinorityShareholders;
    // 少数股东损益
    private String netProfitAttributableToOwnersOfParentCompany;
    // 其他综合收益的税后净额
    private String otherComprehensiveIncomeNOT;
    // 归属于母公司所有者的其他综合收益的税后净额
    private String otherComprehensiveIncomeATOwnersOfTheCompanyNOT;
    // 归属于少数股东的其他综合收益的税后净额
    private String otherComprehensiveIncomeATMinorityInterestsNOT;
    // 综合收益总额
    private String totalComprehensiveIncome;
    // 归属于母公司所有者的综合收益总额
    private String totalComprehensiveIncomeATOwnersOfTheParentCompany;
    // 归属于少数股东的综合收益总额
    private String totalComprehensiveIncomeATMinorityShareholders;
    // 基本每股收益
    private String basicEarningsPerShare;
    // 稀释每股收益
    private String dilutedEarningsPerShare;
}
