package com.lcy.pojo;

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
	public String getCashAndBankBalances() {
		return cashAndBankBalances;
	}
	public void setCashAndBankBalances(String cashAndBankBalances) {
		this.cashAndBankBalances = cashAndBankBalances;
	}
	public String getSettlementReserveFund() {
		return settlementReserveFund;
	}
	public void setSettlementReserveFund(String settlementReserveFund) {
		this.settlementReserveFund = settlementReserveFund;
	}
	public String getLendingsToBanksAndOtherFinancialInstitutions() {
		return LendingsToBanksAndOtherFinancialInstitutions;
	}
	public void setLendingsToBanksAndOtherFinancialInstitutions(String lendingsToBanksAndOtherFinancialInstitutions) {
		LendingsToBanksAndOtherFinancialInstitutions = lendingsToBanksAndOtherFinancialInstitutions;
	}
	public String getFinancialAssetsHeldForTradingA() {
		return financialAssetsHeldForTradingA;
	}
	public void setFinancialAssetsHeldForTradingA(String financialAssetsHeldForTradingA) {
		this.financialAssetsHeldForTradingA = financialAssetsHeldForTradingA;
	}
	public String getFinancialAssetsHeldForTradingB() {
		return financialAssetsHeldForTradingB;
	}
	public void setFinancialAssetsHeldForTradingB(String financialAssetsHeldForTradingB) {
		this.financialAssetsHeldForTradingB = financialAssetsHeldForTradingB;
	}
	public String getFinancialDerivativeAssets() {
		return financialDerivativeAssets;
	}
	public void setFinancialDerivativeAssets(String financialDerivativeAssets) {
		this.financialDerivativeAssets = financialDerivativeAssets;
	}
	public String getNotesReceivable() {
		return notesReceivable;
	}
	public void setNotesReceivable(String notesReceivable) {
		this.notesReceivable = notesReceivable;
	}
	public String getAccountsReceivable() {
		return accountsReceivable;
	}
	public void setAccountsReceivable(String accountsReceivable) {
		this.accountsReceivable = accountsReceivable;
	}
	public String getPrepayments() {
		return prepayments;
	}
	public void setPrepayments(String prepayments) {
		this.prepayments = prepayments;
	}
	public String getReceivablePremium() {
		return receivablePremium;
	}
	public void setReceivablePremium(String receivablePremium) {
		this.receivablePremium = receivablePremium;
	}
	public String getAccountsReceivablereinsurance() {
		return accountsReceivablereinsurance;
	}
	public void setAccountsReceivablereinsurance(String accountsReceivablereinsurance) {
		this.accountsReceivablereinsurance = accountsReceivablereinsurance;
	}
	public String getReinsuranceContractReserve() {
		return reinsuranceContractReserve;
	}
	public void setReinsuranceContractReserve(String reinsuranceContractReserve) {
		this.reinsuranceContractReserve = reinsuranceContractReserve;
	}
	public String getOtherReceivables() {
		return otherReceivables;
	}
	public void setOtherReceivables(String otherReceivables) {
		this.otherReceivables = otherReceivables;
	}
	public String getInterestReceivables() {
		return interestReceivables;
	}
	public void setInterestReceivables(String interestReceivables) {
		this.interestReceivables = interestReceivables;
	}
	public String getDividendReceivables() {
		return dividendReceivables;
	}
	public void setDividendReceivables(String dividendReceivables) {
		this.dividendReceivables = dividendReceivables;
	}
	public String getBuyingBackTheSaleOfFinacialAssets() {
		return buyingBackTheSaleOfFinacialAssets;
	}
	public void setBuyingBackTheSaleOfFinacialAssets(String buyingBackTheSaleOfFinacialAssets) {
		this.buyingBackTheSaleOfFinacialAssets = buyingBackTheSaleOfFinacialAssets;
	}
	public String getInventories() {
		return inventories;
	}
	public void setInventories(String inventories) {
		this.inventories = inventories;
	}
	public String getNonCurrentAssets() {
		return nonCurrentAssets;
	}
	public void setNonCurrentAssets(String nonCurrentAssets) {
		this.nonCurrentAssets = nonCurrentAssets;
	}
	public String getOtherCurrentAssets() {
		return otherCurrentAssets;
	}
	public void setOtherCurrentAssets(String otherCurrentAssets) {
		this.otherCurrentAssets = otherCurrentAssets;
	}
	public String getTotalCurrentAssets() {
		return totalCurrentAssets;
	}
	public void setTotalCurrentAssets(String totalCurrentAssets) {
		this.totalCurrentAssets = totalCurrentAssets;
	}
	public String getLoansAndAdvances() {
		return loansAndAdvances;
	}
	public void setLoansAndAdvances(String loansAndAdvances) {
		this.loansAndAdvances = loansAndAdvances;
	}
	public String getAvailableForSaleFinancialAssets() {
		return availableForSaleFinancialAssets;
	}
	public void setAvailableForSaleFinancialAssets(String availableForSaleFinancialAssets) {
		this.availableForSaleFinancialAssets = availableForSaleFinancialAssets;
	}
	public String getHeldToMaturityInvestments() {
		return heldToMaturityInvestments;
	}
	public void setHeldToMaturityInvestments(String heldToMaturityInvestments) {
		this.heldToMaturityInvestments = heldToMaturityInvestments;
	}
	public String getLongTermReceivables() {
		return longTermReceivables;
	}
	public void setLongTermReceivables(String longTermReceivables) {
		this.longTermReceivables = longTermReceivables;
	}
	public String getLongTermEquityInvestment() {
		return longTermEquityInvestment;
	}
	public void setLongTermEquityInvestment(String longTermEquityInvestment) {
		this.longTermEquityInvestment = longTermEquityInvestment;
	}
	public String getInvenstmentProperty() {
		return invenstmentProperty;
	}
	public void setInvenstmentProperty(String invenstmentProperty) {
		this.invenstmentProperty = invenstmentProperty;
	}
	public String getFixedAssets() {
		return fixedAssets;
	}
	public void setFixedAssets(String fixedAssets) {
		this.fixedAssets = fixedAssets;
	}
	public String getConstructionInProgress() {
		return constructionInProgress;
	}
	public void setConstructionInProgress(String constructionInProgress) {
		this.constructionInProgress = constructionInProgress;
	}
	public String getConstructionMaterials() {
		return constructionMaterials;
	}
	public void setConstructionMaterials(String constructionMaterials) {
		this.constructionMaterials = constructionMaterials;
	}
	public String getProductionOfBiologicalAssets() {
		return productionOfBiologicalAssets;
	}
	public void setProductionOfBiologicalAssets(String productionOfBiologicalAssets) {
		this.productionOfBiologicalAssets = productionOfBiologicalAssets;
	}
	public String getOilAndGasAssets() {
		return oilAndGasAssets;
	}
	public void setOilAndGasAssets(String oilAndGasAssets) {
		this.oilAndGasAssets = oilAndGasAssets;
	}
	public String getIntangibleAssets() {
		return intangibleAssets;
	}
	public void setIntangibleAssets(String intangibleAssets) {
		this.intangibleAssets = intangibleAssets;
	}
	public String getDevelopmentExpenditure() {
		return developmentExpenditure;
	}
	public void setDevelopmentExpenditure(String developmentExpenditure) {
		this.developmentExpenditure = developmentExpenditure;
	}
	public String getGoodWill() {
		return goodWill;
	}
	public void setGoodWill(String goodWill) {
		this.goodWill = goodWill;
	}
	public String getLongTermDeferedExpense() {
		return longTermDeferedExpense;
	}
	public void setLongTermDeferedExpense(String longTermDeferedExpense) {
		this.longTermDeferedExpense = longTermDeferedExpense;
	}
	public String getDeferredIncomeTaxAssets() {
		return deferredIncomeTaxAssets;
	}
	public void setDeferredIncomeTaxAssets(String deferredIncomeTaxAssets) {
		this.deferredIncomeTaxAssets = deferredIncomeTaxAssets;
	}
	public String getOtherNonCurrentAssets() {
		return otherNonCurrentAssets;
	}
	public void setOtherNonCurrentAssets(String otherNonCurrentAssets) {
		this.otherNonCurrentAssets = otherNonCurrentAssets;
	}
	public String getTotalNonCurrentAssets() {
		return totalNonCurrentAssets;
	}
	public void setTotalNonCurrentAssets(String totalNonCurrentAssets) {
		this.totalNonCurrentAssets = totalNonCurrentAssets;
	}
	public String getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(String totalAssets) {
		this.totalAssets = totalAssets;
	}
	public String getShortTermBorrowings() {
		return shortTermBorrowings;
	}
	public void setShortTermBorrowings(String shortTermBorrowings) {
		this.shortTermBorrowings = shortTermBorrowings;
	}
	public String getBorrowingFromTheCentralBank() {
		return borrowingFromTheCentralBank;
	}
	public void setBorrowingFromTheCentralBank(String borrowingFromTheCentralBank) {
		this.borrowingFromTheCentralBank = borrowingFromTheCentralBank;
	}
	public String getAbsorptionOfDepositsAndInterbankDeposits() {
		return absorptionOfDepositsAndInterbankDeposits;
	}
	public void setAbsorptionOfDepositsAndInterbankDeposits(String absorptionOfDepositsAndInterbankDeposits) {
		this.absorptionOfDepositsAndInterbankDeposits = absorptionOfDepositsAndInterbankDeposits;
	}
	public String getLoansFromOtherBanks() {
		return loansFromOtherBanks;
	}
	public void setLoansFromOtherBanks(String loansFromOtherBanks) {
		this.loansFromOtherBanks = loansFromOtherBanks;
	}
	public String getFinancialLiabilitiesHeldForTradingA() {
		return financialLiabilitiesHeldForTradingA;
	}
	public void setFinancialLiabilitiesHeldForTradingA(String financialLiabilitiesHeldForTradingA) {
		this.financialLiabilitiesHeldForTradingA = financialLiabilitiesHeldForTradingA;
	}
	public String getFinancialLiabilitiesHeldForTradingB() {
		return financialLiabilitiesHeldForTradingB;
	}
	public void setFinancialLiabilitiesHeldForTradingB(String financialLiabilitiesHeldForTradingB) {
		this.financialLiabilitiesHeldForTradingB = financialLiabilitiesHeldForTradingB;
	}
	public String getFinancialDerivativeLiabilities() {
		return financialDerivativeLiabilities;
	}
	public void setFinancialDerivativeLiabilities(String financialDerivativeLiabilities) {
		this.financialDerivativeLiabilities = financialDerivativeLiabilities;
	}
	public String getBillsPayable() {
		return billsPayable;
	}
	public void setBillsPayable(String billsPayable) {
		this.billsPayable = billsPayable;
	}
	public String getAccountsPayable() {
		return accountsPayable;
	}
	public void setAccountsPayable(String accountsPayable) {
		this.accountsPayable = accountsPayable;
	}
	public String getAccountReceivedInAdvance() {
		return accountReceivedInAdvance;
	}
	public void setAccountReceivedInAdvance(String accountReceivedInAdvance) {
		this.accountReceivedInAdvance = accountReceivedInAdvance;
	}
	public String getFinancialAssetsSoldForRepurchase() {
		return financialAssetsSoldForRepurchase;
	}
	public void setFinancialAssetsSoldForRepurchase(String financialAssetsSoldForRepurchase) {
		this.financialAssetsSoldForRepurchase = financialAssetsSoldForRepurchase;
	}
	public String getHandlingFeeAndCommission() {
		return handlingFeeAndCommission;
	}
	public void setHandlingFeeAndCommission(String handlingFeeAndCommission) {
		this.handlingFeeAndCommission = handlingFeeAndCommission;
	}
	public String getEmployeeBenefitsPayable() {
		return employeeBenefitsPayable;
	}
	public void setEmployeeBenefitsPayable(String employeeBenefitsPayable) {
		this.employeeBenefitsPayable = employeeBenefitsPayable;
	}
	public String getTaxesPayable() {
		return taxesPayable;
	}
	public void setTaxesPayable(String taxesPayable) {
		this.taxesPayable = taxesPayable;
	}
	public String getOtherAccountPayable() {
		return otherAccountPayable;
	}
	public void setOtherAccountPayable(String otherAccountPayable) {
		this.otherAccountPayable = otherAccountPayable;
	}
	public String getInterestPayable() {
		return interestPayable;
	}
	public void setInterestPayable(String interestPayable) {
		this.interestPayable = interestPayable;
	}
	public String getDiveidendPayable() {
		return diveidendPayable;
	}
	public void setDiveidendPayable(String diveidendPayable) {
		this.diveidendPayable = diveidendPayable;
	}
	public String getAccountsPayableReinsurance() {
		return accountsPayableReinsurance;
	}
	public void setAccountsPayableReinsurance(String accountsPayableReinsurance) {
		this.accountsPayableReinsurance = accountsPayableReinsurance;
	}
	public String getReserveFundForInsuranceContracts() {
		return reserveFundForInsuranceContracts;
	}
	public void setReserveFundForInsuranceContracts(String reserveFundForInsuranceContracts) {
		this.reserveFundForInsuranceContracts = reserveFundForInsuranceContracts;
	}
	public String getActingSaleOfSecurities() {
		return actingSaleOfSecurities;
	}
	public void setActingSaleOfSecurities(String actingSaleOfSecurities) {
		this.actingSaleOfSecurities = actingSaleOfSecurities;
	}
	public String getActingUnderwritingSecurities() {
		return actingUnderwritingSecurities;
	}
	public void setActingUnderwritingSecurities(String actingUnderwritingSecurities) {
		this.actingUnderwritingSecurities = actingUnderwritingSecurities;
	}
	public String getNonCurrentLiabilitiesWithinOneYear() {
		return nonCurrentLiabilitiesWithinOneYear;
	}
	public void setNonCurrentLiabilitiesWithinOneYear(String nonCurrentLiabilitiesWithinOneYear) {
		this.nonCurrentLiabilitiesWithinOneYear = nonCurrentLiabilitiesWithinOneYear;
	}
	public String getOtherCurrentLiabilities() {
		return otherCurrentLiabilities;
	}
	public void setOtherCurrentLiabilities(String otherCurrentLiabilities) {
		this.otherCurrentLiabilities = otherCurrentLiabilities;
	}
	public String getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}
	public void setTotalCurrentLiabilities(String totalCurrentLiabilities) {
		this.totalCurrentLiabilities = totalCurrentLiabilities;
	}
	public String getLongTermLoan() {
		return longTermLoan;
	}
	public void setLongTermLoan(String longTermLoan) {
		this.longTermLoan = longTermLoan;
	}
	public String getBondPayable() {
		return bondPayable;
	}
	public void setBondPayable(String bondPayable) {
		this.bondPayable = bondPayable;
	}
	public String getLongTermAccountPayable() {
		return longTermAccountPayable;
	}
	public void setLongTermAccountPayable(String longTermAccountPayable) {
		this.longTermAccountPayable = longTermAccountPayable;
	}
	public String getEstimatedLiability() {
		return estimatedLiability;
	}
	public void setEstimatedLiability(String estimatedLiability) {
		this.estimatedLiability = estimatedLiability;
	}
	public String getDeferredIncome() {
		return deferredIncome;
	}
	public void setDeferredIncome(String deferredIncome) {
		this.deferredIncome = deferredIncome;
	}
	public String getDeferredTaxLiabilities() {
		return deferredTaxLiabilities;
	}
	public void setDeferredTaxLiabilities(String deferredTaxLiabilities) {
		this.deferredTaxLiabilities = deferredTaxLiabilities;
	}
	public String getOtherNonCurrentLiabilities() {
		return otherNonCurrentLiabilities;
	}
	public void setOtherNonCurrentLiabilities(String otherNonCurrentLiabilities) {
		this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
	}
	public String getTotalNonCurrentLiabilities() {
		return totalNonCurrentLiabilities;
	}
	public void setTotalNonCurrentLiabilities(String totalNonCurrentLiabilities) {
		this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}
	public String getTotalliabilities() {
		return totalliabilities;
	}
	public void setTotalliabilities(String totalliabilities) {
		this.totalliabilities = totalliabilities;
	}
	public String getShareCapital() {
		return shareCapital;
	}
	public void setShareCapital(String shareCapital) {
		this.shareCapital = shareCapital;
	}
	public String getCapitalReserve() {
		return capitalReserve;
	}
	public void setCapitalReserve(String capitalReserve) {
		this.capitalReserve = capitalReserve;
	}
	public String getSpecialReserve() {
		return specialReserve;
	}
	public void setSpecialReserve(String specialReserve) {
		this.specialReserve = specialReserve;
	}
	public String getSurplusReserve() {
		return surplusReserve;
	}
	public void setSurplusReserve(String surplusReserve) {
		this.surplusReserve = surplusReserve;
	}
	public String getGeneralRiskPreparation() {
		return generalRiskPreparation;
	}
	public void setGeneralRiskPreparation(String generalRiskPreparation) {
		this.generalRiskPreparation = generalRiskPreparation;
	}
	public String getUndistributedProfit() {
		return undistributedProfit;
	}
	public void setUndistributedProfit(String undistributedProfit) {
		this.undistributedProfit = undistributedProfit;
	}
	public String getTotalOwnersEquityAttributableToOwnerOfTheCompany() {
		return totalOwnersEquityAttributableToOwnerOfTheCompany;
	}
	public void setTotalOwnersEquityAttributableToOwnerOfTheCompany(
			String totalOwnersEquityAttributableToOwnerOfTheCompany) {
		this.totalOwnersEquityAttributableToOwnerOfTheCompany = totalOwnersEquityAttributableToOwnerOfTheCompany;
	}
	public String getMinorityEquity() {
		return minorityEquity;
	}
	public void setMinorityEquity(String minorityEquity) {
		this.minorityEquity = minorityEquity;
	}
	public String getTotalOwnersEquity() {
		return totalOwnersEquity;
	}
	public void setTotalOwnersEquity(String totalOwnersEquity) {
		this.totalOwnersEquity = totalOwnersEquity;
	}
	public String getTotalLiabilitiesAndOwnersEqutiy() {
		return totalLiabilitiesAndOwnersEqutiy;
	}
	public void setTotalLiabilitiesAndOwnersEqutiy(String totalLiabilitiesAndOwnersEqutiy) {
		this.totalLiabilitiesAndOwnersEqutiy = totalLiabilitiesAndOwnersEqutiy;
	}
	
}
