package com.lcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BalanceSheet {
    // 股票代码
    private String stockCode;
    // 年份
    private String year;

    /**
     * 流动资产
     */

    // 货币资金
    private String cashAndBankBalances;
    // 结算备付金
    private String settlementReserveFund;
    // 拆出资金
    private String LendingsToBanksAndOtherFinancialInstitutions;
    // 以公允价值计量且其变动计入当期损益的金融资产
    private String financialAssetsHeldForTradingA;
    // 交易性金融资产
    private String financialAssetsHeldForTradingB;
    // 衍生金融资产
    private String financialDerivativeAssets;
    // 应收票据
    private String notesReceivable;
    // 应收账款
    private String accountsReceivable;
    // 预付款项
    private String prepayments;
    // 应收保费
    private String receivablePremium;
    // 应收分保账款
    private String accountsReceivablereinsurance;
    // 应收分保合同准备金
    private String reinsuranceContractReserve;
    // 其他应收款
    private String otherReceivables;
    // 其中：应收利息
    private String interestReceivables;
    // 应收股利
    private String dividendReceivables;
    // 买入返售金融资产
    private String buyingBackTheSaleOfFinacialAssets;
    // 存货
    private String inventories;
    // 一年内到期的非流动资产
    private String nonCurrentAssets;
    // 其他流动资产
    private String otherCurrentAssets;
    // 流动资产合计
    private String totalCurrentAssets;

    /**
     * 非流动资产
     */

    // 发放贷款及垫款
    private String loansAndAdvances;
    // 可供出售金融资产
    private String availableForSaleFinancialAssets;
    // 持有至到期投资
    private String heldToMaturityInvestments;
    // 长期应收款
    private String longTermReceivables;
    // 长期股权投资
    private String longTermEquityInvestment;
    // 投资性房地产
    private String invenstmentProperty;
    // 固定资产
    private String fixedAssets;
    // 在建工程
    private String constructionInProgress;
    // 工程物资
    private String constructionMaterials;
    // 生产性生物资产
    private String productionOfBiologicalAssets;
    // 油气资产
    private String oilAndGasAssets;
    // 无形资产
    private String intangibleAssets;
    // 开发支出
    private String developmentExpenditure;
    // 商誉
    private String goodWill;
    // 长期待摊费用
    private String longTermDeferedExpense;
    // 递延所得税资产
    private String deferredIncomeTaxAssets;
    // 其他非流动资产
    private String otherNonCurrentAssets;
    // 非流动资产合计
    private String totalNonCurrentAssets;
    // 资产总计
    private String totalAssets;

    /**
     * 流动负债
     */

    // 短期借款
    private String shortTermBorrowings;
    // 向中央银行借款
    private String borrowingFromTheCentralBank;
    // 吸收存款及同业存放
    private String absorptionOfDepositsAndInterbankDeposits;
    // 拆入资金
    private String loansFromOtherBanks;
    // 交易型金融负债
    private String financialLiabilitiesHeldForTradingA;
    // 以公允价值计量且其变动计入当期损益的金融负债
    private String financialLiabilitiesHeldForTradingB;
    // 衍生金融负债
    private String financialDerivativeLiabilities;
    // 应付票据
    private String billsPayable;
    // 应付账款
    private String accountsPayable;
    // 预收款项
    private String accountReceivedInAdvance;
    // 卖出回购金融资产款
    private String financialAssetsSoldForRepurchase;
    // 应付手续费及佣金
    private String handlingFeeAndCommission;
    // 应付职工薪酬
    private String employeeBenefitsPayable;
    // 应交税费
    private String taxesPayable;
    // 其他应付款
    private String otherAccountPayable;
    // 其中：应付利息
    private String interestPayable;
    // 应付股利
    private String diveidendPayable;
    // 应付分保账款
    private String accountsPayableReinsurance;
    // 保险合同准备金
    private String reserveFundForInsuranceContracts;
    // 代理买卖证券款
    private String actingSaleOfSecurities;
    // 代理承销证券款
    private String actingUnderwritingSecurities;
    // 一年内到期的非流动负债
    private String nonCurrentLiabilitiesWithinOneYear;
    // 其他流动负债
    private String otherCurrentLiabilities;
    // 流动负债合计
    private String totalCurrentLiabilities;

    /**
     * 非流动负债
     */

    // 长期借款
    private String longTermLoan;
    // 应付债券
    private String bondPayable;
    // 长期应付款
    private String longTermAccountPayable;
    // 预计负债
    private String estimatedLiability;
    // 递延收益
    private String deferredIncome;
    // 递延所得税负债
    private String deferredTaxLiabilities;
    // 其他非流动负债
    private String otherNonCurrentLiabilities;
    // 非流动负债合计
    private String totalNonCurrentLiabilities;
    // 负债合计
    private String totalliabilities;

    /**
     * 所有者权益
     */

    // 股本
    private String shareCapital;
    // 资本公积
    private String capitalReserve;
    // 专项储备
    private String specialReserve;
    // 盈余公积
    private String surplusReserve;
    // 一般风险准备
    private String generalRiskPreparation;
    // 未分配利润
    private String undistributedProfit;
    // 归属于母公司所有者权益合计
    private String totalOwnersEquityAttributableToOwnerOfTheCompany;
    // 少数股东权益
    private String minorityEquity;
    // 所有者权益合计
    private String totalOwnersEquity;
    // 负债和所有者权益总计
    private String totalLiabilitiesAndOwnersEqutiy;

}
