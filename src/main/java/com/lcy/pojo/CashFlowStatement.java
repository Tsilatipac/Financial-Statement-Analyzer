package com.lcy.pojo;

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
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCashReceivedFromSaleOfGoodsOrRenderingOfServices() {
		return cashReceivedFromSaleOfGoodsOrRenderingOfServices;
	}
	public void setCashReceivedFromSaleOfGoodsOrRenderingOfServices(
			String cashReceivedFromSaleOfGoodsOrRenderingOfServices) {
		this.cashReceivedFromSaleOfGoodsOrRenderingOfServices = cashReceivedFromSaleOfGoodsOrRenderingOfServices;
	}
	public String getReceiptsOfTaxRefunds() {
		return receiptsOfTaxRefunds;
	}
	public void setReceiptsOfTaxRefunds(String receiptsOfTaxRefunds) {
		this.receiptsOfTaxRefunds = receiptsOfTaxRefunds;
	}
	public String getOtherCashreceiptsRelatingToOperatingActivities() {
		return OtherCashreceiptsRelatingToOperatingActivities;
	}
	public void setOtherCashreceiptsRelatingToOperatingActivities(String otherCashreceiptsRelatingToOperatingActivities) {
		OtherCashreceiptsRelatingToOperatingActivities = otherCashreceiptsRelatingToOperatingActivities;
	}
	public String getSubTotalOfCashInflowsFromOperatingActivities() {
		return subTotalOfCashInflowsFromOperatingActivities;
	}
	public void setSubTotalOfCashInflowsFromOperatingActivities(String subTotalOfCashInflowsFromOperatingActivities) {
		this.subTotalOfCashInflowsFromOperatingActivities = subTotalOfCashInflowsFromOperatingActivities;
	}
	public String getCashPaidFoGoodsAndServices() {
		return cashPaidFoGoodsAndServices;
	}
	public void setCashPaidFoGoodsAndServices(String cashPaidFoGoodsAndServices) {
		this.cashPaidFoGoodsAndServices = cashPaidFoGoodsAndServices;
	}
	public String getCashPaidToAndOnBehalfOfEmployees() {
		return cashPaidToAndOnBehalfOfEmployees;
	}
	public void setCashPaidToAndOnBehalfOfEmployees(String cashPaidToAndOnBehalfOfEmployees) {
		this.cashPaidToAndOnBehalfOfEmployees = cashPaidToAndOnBehalfOfEmployees;
	}
	public String getPaymentsOfVariousTypesOfTaxes() {
		return paymentsOfVariousTypesOfTaxes;
	}
	public void setPaymentsOfVariousTypesOfTaxes(String paymentsOfVariousTypesOfTaxes) {
		this.paymentsOfVariousTypesOfTaxes = paymentsOfVariousTypesOfTaxes;
	}
	public String getOtherCashPaymentsRelatingToOperatingActivities() {
		return otherCashPaymentsRelatingToOperatingActivities;
	}
	public void setOtherCashPaymentsRelatingToOperatingActivities(String otherCashPaymentsRelatingToOperatingActivities) {
		this.otherCashPaymentsRelatingToOperatingActivities = otherCashPaymentsRelatingToOperatingActivities;
	}
	public String getSubTotalOfCashOutflowsFromOperatingActivities() {
		return subTotalOfCashOutflowsFromOperatingActivities;
	}
	public void setSubTotalOfCashOutflowsFromOperatingActivities(String subTotalOfCashOutflowsFromOperatingActivities) {
		this.subTotalOfCashOutflowsFromOperatingActivities = subTotalOfCashOutflowsFromOperatingActivities;
	}
	public String getNetCashFlowsFromOperatingActivities() {
		return netCashFlowsFromOperatingActivities;
	}
	public void setNetCashFlowsFromOperatingActivities(String netCashFlowsFromOperatingActivities) {
		this.netCashFlowsFromOperatingActivities = netCashFlowsFromOperatingActivities;
	}
	public String getCashReceiptsFromRecoveryOfInvestments() {
		return cashReceiptsFromRecoveryOfInvestments;
	}
	public void setCashReceiptsFromRecoveryOfInvestments(String cashReceiptsFromRecoveryOfInvestments) {
		this.cashReceiptsFromRecoveryOfInvestments = cashReceiptsFromRecoveryOfInvestments;
	}
	public String getCashReceiptsFromInvestmentIncome() {
		return cashReceiptsFromInvestmentIncome;
	}
	public void setCashReceiptsFromInvestmentIncome(String cashReceiptsFromInvestmentIncome) {
		this.cashReceiptsFromInvestmentIncome = cashReceiptsFromInvestmentIncome;
	}
	public String getNetCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA() {
		return netCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA;
	}
	public void setNetCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA(
			String netCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA) {
		this.netCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA = netCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA;
	}
	public String getNetCashReceFromDisposalsOfSubsidiariesAOBusinessUnits() {
		return netCashReceFromDisposalsOfSubsidiariesAOBusinessUnits;
	}
	public void setNetCashReceFromDisposalsOfSubsidiariesAOBusinessUnits(
			String netCashReceFromDisposalsOfSubsidiariesAOBusinessUnits) {
		this.netCashReceFromDisposalsOfSubsidiariesAOBusinessUnits = netCashReceFromDisposalsOfSubsidiariesAOBusinessUnits;
	}
	public String getOtherCashReceiptsRelatingToInvestingActivities() {
		return otherCashReceiptsRelatingToInvestingActivities;
	}
	public void setOtherCashReceiptsRelatingToInvestingActivities(String otherCashReceiptsRelatingToInvestingActivities) {
		this.otherCashReceiptsRelatingToInvestingActivities = otherCashReceiptsRelatingToInvestingActivities;
	}
	public String getSubTotalOfCashInflowsFromInvestingActivities() {
		return subTotalOfCashInflowsFromInvestingActivities;
	}
	public void setSubTotalOfCashInflowsFromInvestingActivities(String subTotalOfCashInflowsFromInvestingActivities) {
		this.subTotalOfCashInflowsFromInvestingActivities = subTotalOfCashInflowsFromInvestingActivities;
	}
	public String getCashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA() {
		return cashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA;
	}
	public void setCashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA(
			String cashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA) {
		this.cashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA = cashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA;
	}
	public String getCashPaidToAcquireInvestments() {
		return cashPaidToAcquireInvestments;
	}
	public void setCashPaidToAcquireInvestments(String cashPaidToAcquireInvestments) {
		this.cashPaidToAcquireInvestments = cashPaidToAcquireInvestments;
	}
	public String getNetCashPaidToAquireSubsidiariesAndOtherBusinessUnits() {
		return netCashPaidToAquireSubsidiariesAndOtherBusinessUnits;
	}
	public void setNetCashPaidToAquireSubsidiariesAndOtherBusinessUnits(
			String netCashPaidToAquireSubsidiariesAndOtherBusinessUnits) {
		this.netCashPaidToAquireSubsidiariesAndOtherBusinessUnits = netCashPaidToAquireSubsidiariesAndOtherBusinessUnits;
	}
	public String getOtherCashPaymentsRelatingToInvestingActivities() {
		return otherCashPaymentsRelatingToInvestingActivities;
	}
	public void setOtherCashPaymentsRelatingToInvestingActivities(String otherCashPaymentsRelatingToInvestingActivities) {
		this.otherCashPaymentsRelatingToInvestingActivities = otherCashPaymentsRelatingToInvestingActivities;
	}
	public String getSubTotalOfCashOutflowsFromInvestingActivities() {
		return subTotalOfCashOutflowsFromInvestingActivities;
	}
	public void setSubTotalOfCashOutflowsFromInvestingActivities(String subTotalOfCashOutflowsFromInvestingActivities) {
		this.subTotalOfCashOutflowsFromInvestingActivities = subTotalOfCashOutflowsFromInvestingActivities;
	}
	public String getNetCashFlowsFromInvestingActivities() {
		return netCashFlowsFromInvestingActivities;
	}
	public void setNetCashFlowsFromInvestingActivities(String netCashFlowsFromInvestingActivities) {
		this.netCashFlowsFromInvestingActivities = netCashFlowsFromInvestingActivities;
	}
	public String getCashReceiptsFromCapitalContributions() {
		return cashReceiptsFromCapitalContributions;
	}
	public void setCashReceiptsFromCapitalContributions(String cashReceiptsFromCapitalContributions) {
		this.cashReceiptsFromCapitalContributions = cashReceiptsFromCapitalContributions;
	}
	public String getCashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi() {
		return cashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi;
	}
	public void setCashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi(
			String cashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi) {
		this.cashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi = cashReceiptsFromCapitalContributionsFromMinorOwnerOfSubsidi;
	}
	public String getCashReceiptsFromBorrowings() {
		return cashReceiptsFromBorrowings;
	}
	public void setCashReceiptsFromBorrowings(String cashReceiptsFromBorrowings) {
		this.cashReceiptsFromBorrowings = cashReceiptsFromBorrowings;
	}
	public String getOtherCashReceiptsRelatingToFinancingActivities() {
		return otherCashReceiptsRelatingToFinancingActivities;
	}
	public void setOtherCashReceiptsRelatingToFinancingActivities(String otherCashReceiptsRelatingToFinancingActivities) {
		this.otherCashReceiptsRelatingToFinancingActivities = otherCashReceiptsRelatingToFinancingActivities;
	}
	public String getSubTotalOfCashInflowsFromFinancingActivities() {
		return subTotalOfCashInflowsFromFinancingActivities;
	}
	public void setSubTotalOfCashInflowsFromFinancingActivities(String subTotalOfCashInflowsFromFinancingActivities) {
		this.subTotalOfCashInflowsFromFinancingActivities = subTotalOfCashInflowsFromFinancingActivities;
	}
	public String getCashRepaymentsOfBorrowings() {
		return cashRepaymentsOfBorrowings;
	}
	public void setCashRepaymentsOfBorrowings(String cashRepaymentsOfBorrowings) {
		this.cashRepaymentsOfBorrowings = cashRepaymentsOfBorrowings;
	}
	public String getCashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen() {
		return cashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen;
	}
	public void setCashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen(
			String cashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen) {
		this.cashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen = cashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen;
	}
	public String getDividendsAndProfitsPaidBySubsidiariesToMinorityShareholders() {
		return dividendsAndProfitsPaidBySubsidiariesToMinorityShareholders;
	}
	public void setDividendsAndProfitsPaidBySubsidiariesToMinorityShareholders(
			String dividendsAndProfitsPaidBySubsidiariesToMinorityShareholders) {
		this.dividendsAndProfitsPaidBySubsidiariesToMinorityShareholders = dividendsAndProfitsPaidBySubsidiariesToMinorityShareholders;
	}
	public String getOtherCashPaymentsRelatingToFinancingActivities() {
		return otherCashPaymentsRelatingToFinancingActivities;
	}
	public void setOtherCashPaymentsRelatingToFinancingActivities(String otherCashPaymentsRelatingToFinancingActivities) {
		this.otherCashPaymentsRelatingToFinancingActivities = otherCashPaymentsRelatingToFinancingActivities;
	}
	public String getSubTotalOfCashOutflowsFromFinancingActivities() {
		return subTotalOfCashOutflowsFromFinancingActivities;
	}
	public void setSubTotalOfCashOutflowsFromFinancingActivities(String subTotalOfCashOutflowsFromFinancingActivities) {
		this.subTotalOfCashOutflowsFromFinancingActivities = subTotalOfCashOutflowsFromFinancingActivities;
	}
	public String getNetCashFlowsFromFinancingActivities() {
		return netCashFlowsFromFinancingActivities;
	}
	public void setNetCashFlowsFromFinancingActivities(String netCashFlowsFromFinancingActivities) {
		this.netCashFlowsFromFinancingActivities = netCashFlowsFromFinancingActivities;
	}
	public String getEffectOfForeignExchangeRateChangesOnCashandCashEquivalents() {
		return effectOfForeignExchangeRateChangesOnCashandCashEquivalents;
	}
	public void setEffectOfForeignExchangeRateChangesOnCashandCashEquivalents(
			String effectOfForeignExchangeRateChangesOnCashandCashEquivalents) {
		this.effectOfForeignExchangeRateChangesOnCashandCashEquivalents = effectOfForeignExchangeRateChangesOnCashandCashEquivalents;
	}
	public String getNetIncreaseinCashandCashEquivalents() {
		return netIncreaseinCashandCashEquivalents;
	}
	public void setNetIncreaseinCashandCashEquivalents(String netIncreaseinCashandCashEquivalents) {
		this.netIncreaseinCashandCashEquivalents = netIncreaseinCashandCashEquivalents;
	}
	public String getOpeningBalanceofCashAndCashEquivalents() {
		return openingBalanceofCashAndCashEquivalents;
	}
	public void setOpeningBalanceofCashAndCashEquivalents(String openingBalanceofCashAndCashEquivalents) {
		this.openingBalanceofCashAndCashEquivalents = openingBalanceofCashAndCashEquivalents;
	}
	public String getClosingBalanceofCashandCashEquivalents() {
		return closingBalanceofCashandCashEquivalents;
	}
	public void setClosingBalanceofCashandCashEquivalents(String closingBalanceofCashandCashEquivalents) {
		this.closingBalanceofCashandCashEquivalents = closingBalanceofCashandCashEquivalents;
	}
	
}
