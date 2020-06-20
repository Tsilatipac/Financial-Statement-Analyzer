package com.lcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowStatement {
    // 股票代码
    private String stockCode;
    // 年份s
    private String year;

    /**
     * 经营活动产生的现金流量：
     */

    // 销售商品、提供劳务收到的现金
    private String cashReceivedFromSaleOfGoodsOrRenderingOfServices;
    // 收到的税费返还
    private String receiptsOfTaxRefunds;
    // 收到其他与经营活动有关的现金
    private String OtherCashreceiptsRelatingToOperatingActivities;
    // 经营活动现金流入小计
    private String subTotalOfCashInflowsFromOperatingActivities;
    // 购买商品、接受劳务支付的现金
    private String cashPaidFoGoodsAndServices;
    // 支付给职工以及为职工支付的现金
    private String cashPaidToAndOnBehalfOfEmployees;
    // 支付的各项税费
    private String paymentsOfVariousTypesOfTaxes;
    // 支付其他与经营活动有关的现金
    private String otherCashPaymentsRelatingToOperatingActivities;
    // 经营活动现金流出小计
    private String subTotalOfCashOutflowsFromOperatingActivities;
    // 经营活动产生的现金流量净额
    private String netCashFlowsFromOperatingActivities;

    /**
     * 投资活动产生的现金流量：
     */

    // 收回投资收到的现金
    private String cashReceiptsFromRecoveryOfInvestments;
    // 取得投资收益收到的现金
    private String cashReceiptsFromInvestmentIncome;
    // 处置固定资产、无形资产和其他长期资产收回的现金净额
    private String netCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA;
    // 处置子公司及其他营业单位收到的现金净额
    private String netCashReceFromDisposalsOfSubsidiariesAOBusinessUnits;
    // 收到其他与投资活动有关的现金
    private String otherCashReceiptsRelatingToInvestingActivities;
    // 投资活动现金流入小计
    private String subTotalOfCashInflowsFromInvestingActivities;
    // 购建固定资产、无形资产和其他长期资产支付的现金
    private String cashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA;
    // 投资支付的现金
    private String cashPaidToAcquireInvestments;
    // 取得子公司及其他营业单位支付的现金净额
    private String netCashPaidToAquireSubsidiariesAndOtherBusinessUnits;
    // 支付其他与投资活动有关的现金
    private String otherCashPaymentsRelatingToInvestingActivities;
    // 投资活动现金流出小计
    private String subTotalOfCashOutflowsFromInvestingActivities;
    // 投资活动产生的现金流量净额
    private String netCashFlowsFromInvestingActivities;

    /**
     * 筹资活动产生的现金流量：
     */

    // 吸收投资收到的现金
    private String cashReceiptsFromCapitalContributions;
    // 其中：子公司吸收少数股东投资收到的现金
    private String cashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi;
    // 取得借款收到的现金
    private String cashReceiptsFromBorrowings;
    // 收到其他与筹资活动有关的现金
    private String otherCashReceiptsRelatingToFinancingActivities;
    // 筹资活动现金流入小计
    private String subTotalOfCashInflowsFromFinancingActivities;
    // 偿还债务支付的现金
    private String cashRepaymentsOfBorrowings;
    // 分配股利、利润或偿付利息支付的现金
    private String cashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen;
    // 子公司支付给少数股东的股利、利润
    private String dividendsAndProfitsPaidBySubsidiariesToMinorityShareholders;
    // 支付其他与筹资活动有关的现金
    private String otherCashPaymentsRelatingToFinancingActivities;
    // 筹资活动现金流出小计
    private String subTotalOfCashOutflowsFromFinancingActivities;
    // 筹资活动产生的现金流量净额
    private String netCashFlowsFromFinancingActivities;

    /**
     * 汇率变动对现金的影响
     */

    private String effectOfForeignExchangeRateChangesOnCashandCashEquivalents;

    /**
     * 现金及现金等价物净增加额
     */

    private String netIncreaseinCashandCashEquivalents;
    // 期初现金及现金等价物余额
    private String openingBalanceofCashAndCashEquivalents;

    /**
     * 期末现金及现金等价物余额
     */

    private String closingBalanceofCashandCashEquivalents;
}
