package com.lcy.utils;

import com.lcy.pojo.BalanceSheet;
import com.lcy.pojo.CashFlowStatement;
import com.lcy.pojo.IncomeStatement;

public class FinancialStatementAnalyer {
	private BalanceSheet balanceSheet;
	private CashFlowStatement cashFlowStatement;
	private IncomeStatement incomeStatement;

	public void setBalanceSheet(BalanceSheet balanceSheet) {
		this.balanceSheet = balanceSheet;
	}

	public void setCashFlowStatement(CashFlowStatement cashFlowStatement) {
		this.cashFlowStatement = cashFlowStatement;
	}

	public void setIncomeStatement(IncomeStatement incomeStatement) {
		this.incomeStatement = incomeStatement;
	}

	public FinancialStatementAnalyer() {

	}

	public FinancialStatementAnalyer(BalanceSheet balanceSheet, CashFlowStatement cashFlowStatement, IncomeStatement incomeStatement) {
		this.balanceSheet = balanceSheet;
		this.cashFlowStatement = cashFlowStatement;
		this.incomeStatement = incomeStatement;
	}

	/**
	 * 长期资产净投资额 = 购建长期资产支付的现金 - 处置长期资产收回的现金
	 * 
	 * @return
	 */
	public Double getNetInvestmentInLongTermAssets() {
		Double netInvestmentInLongTermAssets = null;
		try {
			if (cashFlowStatement != null) {
				Double a = MyFormatUtils.parseDouble(cashFlowStatement.getCashPaymentsToAcquOrConstructFixedAsIntangibleAAOLongTermA());
				Double b = MyFormatUtils.parseDouble(cashFlowStatement.getNetCashReceFromDisposalsOfFixedAIntangibleAAOLongTermA());
				netInvestmentInLongTermAssets = a - b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getNetInvestmentInLongTermAssets()");
		}
		return netInvestmentInLongTermAssets;
	}

	// 长期资产新投资额 = 长期资产净投资额 - 报废或到期退役的长期资产 P72
	// 长期资产扩张性资本支出比例 = 长期资产新投资额 ÷ 期初长期资产净额 × 100% P72

	/**
	 * 净合并额 = 取得子公司支付的现金 - 处置子公司收回的现金<br>
	 * 净合并额大于零，表明公司通过并购活动在扩张；<br>
	 * 净合并额小于零，表明公司通过出售子公司在收缩；<br>
	 * 净合并额接近于零，表明公司没有并购活动，维持原有状态。
	 * 
	 * @return
	 */
	public Double getNetConsolidation() {
		Double netConsolidation = null;
		try {
			if (cashFlowStatement != null) {
				Double a = MyFormatUtils.parseDouble(cashFlowStatement.getNetCashPaidToAquireSubsidiariesAndOtherBusinessUnits());
				Double b = MyFormatUtils.parseDouble(cashFlowStatement.getNetCashReceFromDisposalsOfSubsidiariesAOBusinessUnits());
				netConsolidation = a - b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getNetConsolidation()");
		}
		return netConsolidation;
	}

	/**
	 * 战略投资活动的综合现金需求 = 购建活动的净投资额 + 并购活动的净合并额
	 * 
	 * @return
	 */
	public Double getIntegratedCashRequirementsForStrategicInvestmentActivities() {
		Double integratedCashRequirementsForStrategicInvestmentActivities = null;
		try {
			integratedCashRequirementsForStrategicInvestmentActivities = getNetInvestmentInLongTermAssets() + getNetConsolidation();
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getIntegratedCashRequirementsForStrategicInvestmentActivities()");
		}
		return integratedCashRequirementsForStrategicInvestmentActivities;
	}

	/**
	 * 现金自给率 = 经营活动现金流量净额 ÷ 战略投资活动综合现金需求
	 * 
	 * @return
	 */
	public Double getCashSelfSufficiencyRate() {
		Double cashSelfSufficiencyRate = null;
		try {
			if (cashFlowStatement != null) {
				Double a = MyFormatUtils.parseDouble(cashFlowStatement.getNetCashFlowsFromOperatingActivities());
				Double b = getIntegratedCashRequirementsForStrategicInvestmentActivities();
				cashSelfSufficiencyRate = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getCashSelfSufficiencyRate()");
		}
		return cashSelfSufficiencyRate;
	}

	/**
	 * 筹资需求 = 经营活动现金流量净额 - 战略投资活动综合现金需求 + 期初金融资产金额
	 * 
	 * @return
	 */
	public Double getFundingRequirements() {
		Double fundingRequirements = null;
		try {
			if (cashFlowStatement != null && balanceSheet != null) {
				Double a = MyFormatUtils.parseDouble(cashFlowStatement.getNetCashFlowsFromOperatingActivities());
				Double b = getIntegratedCashRequirementsForStrategicInvestmentActivities();
				Double c = MyFormatUtils.parseDouble(balanceSheet.getCashAndBankBalances());
				fundingRequirements = a - b + c;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getFundingRequirements()");
		}
		return fundingRequirements;
	}

	/**
	 * 股东筹资净额 = 吸收投资收到的现金 - 分配股利、利润支付的现金
	 * 
	 * @return
	 */
	public Double getNetShareholderFinancing() {
		Double netShareholderFinancing = null;
		try {
			if (cashFlowStatement != null) {
				Double a = MyFormatUtils.parseDouble(cashFlowStatement.getCashReceiptsFromCapitalContributions());
				Double b = MyFormatUtils.parseDouble(cashFlowStatement.getCashPaymentsForDistributionOfDiviOrProfiOrSettlOfIntExpen());
				netShareholderFinancing = a - b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getNetShareholderFinancing()");
		}
		return netShareholderFinancing;
	}

	/**
	 * 债务筹资净额 = 借款收到的现金 - 偿还债务所支付的现金
	 * 
	 * @return
	 */
	public Double getNetDebtFinancing() {
		Double netDoubleFinancing = null;
		try {
			if (cashFlowStatement != null) {
				Double a = MyFormatUtils.parseDouble(cashFlowStatement.getCashReceiptsFromBorrowings());
				Double b = MyFormatUtils.parseDouble(cashFlowStatement.getCashRepaymentsOfBorrowings());
				netDoubleFinancing = a - b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getNetDebtFinancing()");
		}
		return netDoubleFinancing;
	}

	/**
	 * 有息负债率 = 有息债务 ÷ 资本总额 × 100% = （ 短期债务 + 长期债务 ） ÷ 资本总额 * 100%
	 * 
	 * @return
	 */
	public Double getRateOfInterestBearingDebt() {
		Double rateOfInterestBearingDebt = null;
		try {
			if (balanceSheet != null) {
				Double a = MyFormatUtils.parseDouble(balanceSheet.getShortTermBorrowings());
				Double b = MyFormatUtils.parseDouble(balanceSheet.getBorrowingFromTheCentralBank());
				Double c = MyFormatUtils.parseDouble(balanceSheet.getLongTermLoan());
				Double d = MyFormatUtils.parseDouble(balanceSheet.getTotalAssets());
				rateOfInterestBearingDebt = (a + b + c) / d;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getRateOfInterestBearingDebt()");
		}
		return rateOfInterestBearingDebt;
	}

	/**
	 * 股权资本比率 = 股权资本 ÷ 资本总额 × 100% <br>
	 * 股权资本 = 股本 + 资本公积
	 * 
	 * @return
	 */
	public Double getEquityCapitalRatio() {
		Double equityCapitalRatio = null;
		try {
			if (balanceSheet != null) {
				Double a1 = MyFormatUtils.parseDouble(balanceSheet.getShareCapital());
				Double a2 = MyFormatUtils.parseDouble(balanceSheet.getCapitalReserve());
				Double b = MyFormatUtils.parseDouble(balanceSheet.getTotalLiabilitiesAndOwnersEqutiy());
				equityCapitalRatio = (a1 + a2) / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getEquityCapitalRatio()");
		}
		return equityCapitalRatio;
	}

	/**
	 * 财务杠杆倍数 = 资产总额 ÷ 股东权益 = 资本总额 ÷ 股东权益 <br>
	 * 股东权益 = 括股本 + 资本公积 + 盈余公积 + 未分配利润
	 * 
	 * @return
	 */
	public Double getLeverage() {
		Double equityCapitalRatio = null;
		try {
			if (balanceSheet != null) {
				Double a = MyFormatUtils.parseDouble(balanceSheet.getTotalLiabilitiesAndOwnersEqutiy());
				Double b = MyFormatUtils.parseDouble(balanceSheet.getTotalOwnersEquity());
				equityCapitalRatio = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getLeverage()");
		}
		return equityCapitalRatio;
	}

	/**
	 * 毛利 = 营业收入 - 营业成本 = 销量 ×（ 单位价格 - 单位成本 ）
	 * 
	 * @return
	 */
	public Double getGrossProfit() {
		Double grossProfit = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingCosts());
				grossProfit = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getGrossProfit()");
		}
		return grossProfit;
	}

	/**
	 * 毛利率 = 毛利 ÷ 营业收入 × 100% =［ 销量 ×（ 单位价格 - 单位成本 ）］÷［ 销量×单位价格 ］× 100% =（ 单位价格
	 * - 单位成本 ）÷ 单位价格 × 100% <br>
	 * 护城河即竞争壁垒，多数时候一家公司毛利率的高低就是反映其是否具有护城河的指标：毛利率越高越稳定，护城河越深
	 * 
	 * @return
	 */
	public Double getGrossProfitRate() {
		Double grossProfitRate = null;
		try {
			if (incomeStatement != null) {
				Double a = getGrossProfit();
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				grossProfitRate = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getGrossMargin()");
		}
		return grossProfitRate;
	}

	/**
	 * 营业税金及附加率 = 营业税金及附加 ÷ 营业收入 × 100%
	 * 
	 * @return
	 */
	public Double getBusinessTaxesAndSurchargesRagte() {
		Double businessTaxesAndSurchargesRagte = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getBusinessTaxesAndSurcharges());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				businessTaxesAndSurchargesRagte = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getBusinessTaxesAndSurchargesRagte()");
		}
		return businessTaxesAndSurchargesRagte;
	}

	/**
	 * 销售费用率 = 销售费用 ÷ 营业收入 × 100%
	 * 
	 * @return
	 */
	public Double getSalesExpenseRatio() {
		Double salesExpenseRatio = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getSellingExpenses());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				salesExpenseRatio = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getSalesExpenseRatio()");
		}
		return salesExpenseRatio;
	}

	/**
	 * 管理费用率 = 管理费用 ÷ 营业收入 × 100%
	 * 
	 * @return
	 */
	public Double getManagementExpenseRatio() {
		Double managementExpenseRatio = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getAdministrativeExpenses());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				managementExpenseRatio = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getManagementExpenseRatio()");
		}
		return managementExpenseRatio;
	}

	/**
	 * 资产减值损失占营业收入比率 = 资产减值损失 ÷ 营业收入 × 100%
	 * 
	 * @return
	 */
	public Double getAssetImpairmentLossAsARatioOfOperatingIncome() {
		Double assetImpairmentLossAsARatioOfOperatingIncome = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getImpairmentLoss());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				assetImpairmentLossAsARatioOfOperatingIncome = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getAssetImpairmentLossAsARatioOfOperatingIncome()");
		}
		return assetImpairmentLossAsARatioOfOperatingIncome;
	}

	/**
	 * 营业外收支占营业收入比率 = 营业外收支 ÷ 营业收入 × 100%
	 * 
	 * @return
	 */
	public Double getRatioOfNonOperatingIncomeToOperatingIncome() {
		Double ratioOfNonOperatingIncomeToOperatingIncome = null;
		try {
			if (incomeStatement != null) {
				Double a1 = MyFormatUtils.parseDouble(incomeStatement.getNonOperatingIncome());
				Double a2 = MyFormatUtils.parseDouble(incomeStatement.getNonOperatingExpenses());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getOperatingIncome());
				ratioOfNonOperatingIncomeToOperatingIncome = (a1 + a2) / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getRatioOfNonOperatingIncomeToOperatingIncome()");
		}
		return ratioOfNonOperatingIncomeToOperatingIncome;
	}

	/**
	 * 总费用率 = ( 营业税金及附加 + 销售费用 + 管理费用 + 资产减值损失 + 营业外收支 ) ÷ 营业收入 × 100%
	 * 
	 * @return
	 */
	public Double getTotalOperatingExpensesRatio() {
		Double totalOperatingExpensesRatio = null;
		totalOperatingExpensesRatio = getBusinessTaxesAndSurchargesRagte() + getSalesExpenseRatio() + getManagementExpenseRatio()
				+ getAssetImpairmentLossAsARatioOfOperatingIncome() + getRatioOfNonOperatingIncomeToOperatingIncome();
		return totalOperatingExpensesRatio;
	}

	/**
	 * 息税前经营利润 = 营业收入 - 营业成本 - 营业费用
	 * 
	 * @return
	 */
	public Double getOperatingProfitBeforeInterestAndTax() {
		Double operatingProfitBeforeInterestAndTax = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getNonOperatingIncome());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getNonOperatingExpenses());
				Double c1 = MyFormatUtils.parseDouble(incomeStatement.getBusinessTaxesAndSurcharges());
				Double c2 = MyFormatUtils.parseDouble(incomeStatement.getSellingExpenses());
				Double c3 = MyFormatUtils.parseDouble(incomeStatement.getAdministrativeExpenses());
				Double c4 = MyFormatUtils.parseDouble(incomeStatement.getFinancialExpenses());
				Double c5 = MyFormatUtils.parseDouble(incomeStatement.getImpairmentLoss());
				operatingProfitBeforeInterestAndTax = a - b - (c1 + c2 + c3 + c4 + c5);
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getOperatingProfitBeforeInterestAndTax()");
		}
		return operatingProfitBeforeInterestAndTax;
	}

	// /**
	// * 息前税后经营利润 = 息税前经营利润 ×（ 1 - 企业实际所得税税率 ）P148
	// *
	// * @return
	// */
	// public Double getOperatingProfitBeforeInterestAndAfterTax() {
	// Double operatingProfitBeforeInterestAndAfterTax = null;
	//
	// return operatingProfitBeforeInterestAndAfterTax;
	// }
	//
	// /**
	// * 营业收入利润率 = 息前税后经营利润 ÷ 营业收入 × 100% P148
	// *
	// * @return
	// */
	// public Double getOperatingRevenueMargin() {
	// Double operatingRevenueMargin = null;
	//
	// return operatingRevenueMargin;
	// }

	// 真实财务费用 = 标准利润表中的财务费用 + 利息收入

	// 财务成本负担率=真实财务费用/息税前利润 =（息税前利润-税前利润）/息税前利润 =1-税前利润/息税前利润 =
	// 税前利润=息税前利润-真实财务费用

	/**
	 * 实际企业所得税税率 = 1 - 净利润 / 税前利润 × 100%
	 * 
	 * @return
	 */
	public Double getEffectiveCorporateIncomeTaxRate() {
		Double effectiveCorporateIncomeTaxRate = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getNetProfit());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getTotalProfit());
				effectiveCorporateIncomeTaxRate = 1 - (a / b);
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getEffectiveCorporateIncomeTaxRate()");
		}
		return effectiveCorporateIncomeTaxRate;
	}

	/**
	 * 净利润 = 税前利润 - 企业所得税费用
	 * 
	 * @return
	 */
	public Double getNetProfit() {
		Double netProfit = null;
		try {
			if (incomeStatement != null) {
				netProfit = MyFormatUtils.parseDouble(incomeStatement.getNetProfit());
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getNetProfit()");
		}
		return netProfit;
	}

	/**
	 * 股东权益回报率 = 净利润 ÷ 股东权益 × 100%
	 * 
	 * @return
	 */
	public Double getReturnOnEquity() {
		Double returnOnEquity = null;
		try {
			if (incomeStatement != null && balanceSheet != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getNetProfit());
				Double b = MyFormatUtils.parseDouble(balanceSheet.getTotalOwnersEquity());
				returnOnEquity = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getReturnOnEquity()");
		}
		return returnOnEquity;
	}

	// P164
	// 息税前资产回报率 = 息税前利润 ÷ 资产总额×100%

	// P165
	// 经营资产周转率 = 营业收入 ÷ 经营资产
	// 长期经营资产周转率 = 营业收入 ÷ 长期经营资产
	// 营运资本周转率 = 营业收入 ÷ 营运资本

	// P166
	// 固定资产周转率 = 销售收入 ÷ 平均固定资产净值
	// 固定资产平均净值 = ( 期初净值 + 期末净值 ) ÷ 2
	// 固定资产成新率 = 固定资产净值 ÷ 固定资产原值

	// P168
	// 营业周期 = 存货周转天数 + 应收账款周转天数
	// 现金周期 = 存货周转天数 + 应收账款周转天数 - 应付账款周转天数

	// P169
	// 应收账款周转率（次）=赊销收入净额 ÷ 平均应收账款
	// 应收账款周转天数 = 计算期天数 ÷ 应收账款周转率 =（平均应收账款 × 计算期天数）÷ 赊销收入净额
	// 平均营收款 = (( 期初应收账款 + 期初应收票据 - 期初预收款项 ) + ( 期末应收账款 + 期末应收票据 - 期末预收款项 )) ÷ 2

	// P170
	// 存货周转率（次数）= 销货成本 ÷ 平均存货余额
	// 其中：平均存货余额 =（期初存货 + 期末存货）÷ 2
	// 存货周转天数 = 计算期天数 ÷ 存货周转率（次数）= 计算期天数 × 平均存货余额 ÷ 销货成本
	// 应付账款周转率（次数）= 采购成本 / 平均应付账款 P170
	// 其中：应付账款平均余额 =（应付账款期初数 + 应付账款期末数）÷ 2
	// 应付账款平均付账期（天数）= 计算期天数 ÷ 应付账款周转率
	// 期初存货 + 采购成本 + 生产成本 - 销售成本 = 期末存货
	// 采购成本 = 销售成本 + 期末存货 - 期初存货 - 生产成本

	// P171
	// 息税前经营资产回报率 = 息税前经营利润 ÷ 经营资产总额 × 100%
	// 我们可以进一步分解为：
	// 息税前经营资产回报率 = 息税前经营利润 ÷ 营业收入 × 营业收入 ÷ 经营资产总额 × 100% = 息税前营业利润率 × 经营资产周转率 ×
	// 100%

	// P172
	// 长期股权投资收益率 = 长期股权投资收益 ÷ 长期股权投资 × 100%

	// P173
	// 金融资产收益率 = 金融资产收益 ÷ 金融资产 × 100%

	// P174
	// 财务杠杆效应的计算公式如下：
	// 财务杠杆效应 = 财务成本效应比率 × 财务杠杆倍数
	// 其中：
	// 财务成本效应比率 = 税前利润 / 息税前利润 =（ 息税前利润 - 真实财务费用 ）/息税前利润 = 1 - 财务成本负担率
	// 财务杠杆倍数 = 资产总额 / 股东权益 = 资本总额 / 股东权益

	// P178
	// 股东权益回报率 =（ 息税前利润 - 利息费用 ）/ 股东权益 × 100%
	// 债务对股东权益比率 =（ 短期借款 + 长期借款 ）/ 股东权益
	// 利息保障倍数 = 息税前利润 / 利息费用

	/**
	 * 企业所得税效应比率 = 净利润 / 税前利润 =（ 税前利润 - 公司所得税费用 ）/税前利润 = 1 - 企业实际所得税税率
	 * 
	 * @return
	 */
	public Double getCorporateIncomeTaxEffectRatio() {
		Double corporateIncomeTaxEffectRatio = null;
		try {
			if (incomeStatement != null) {
				Double a = MyFormatUtils.parseDouble(incomeStatement.getNetProfit());
				Double b = MyFormatUtils.parseDouble(incomeStatement.getTotalProfit());
				corporateIncomeTaxEffectRatio = a / b;
			}
		} catch (Exception e) {
			System.out.println("FinancialStatementAnalyer.getCorporateIncomeTaxEffectRatio()");
		}
		return corporateIncomeTaxEffectRatio;
	}

	// P184
	// 营业收入现金含量 = (( 销售商品、提供劳务收到的现金 ) ÷ 1 + 增值税销售税率 ) ÷ 营业收入 × 100%

	// P185
	// 成本费用付现率 =［ 采购商品、接受劳务支付的现金 /（ 1 + 增值税进项税率）+ 支付给职工以及为职工支付的现金 ］/（ 营业成本 +
	// 营业税金及附加 + 销售费用 + 管理费用 ）× 100%
}
