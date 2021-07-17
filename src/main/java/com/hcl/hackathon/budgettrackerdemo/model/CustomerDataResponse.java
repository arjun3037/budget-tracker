package com.hcl.hackathon.budgettrackerdemo.model;

import java.math.BigDecimal;
import java.util.Map;

import lombok.Data;


public class CustomerDataResponse {
	
	private Long customerId;
	
	private String category;
	
	private String payementType;
	
	private Map<String, BigDecimal> incomeByCategory;
	
	private Map<String, BigDecimal> expenseByCategory;
	
	
	private Double totalIncome;
	
	private Double totalexpense;
	
	private Double totalSaving;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPayementType() {
		return payementType;
	}

	public void setPayementType(String payementType) {
		this.payementType = payementType;
	}

	public Map<String, BigDecimal> getIncomeByCategory() {
		return incomeByCategory;
	}

	public void setIncomeByCategory(Map<String, BigDecimal> incomeByCategory) {
		this.incomeByCategory = incomeByCategory;
	}

	public Map<String, BigDecimal> getExpenseByCategory() {
		return expenseByCategory;
	}

	public void setExpenseByCategory(Map<String, BigDecimal> expenseByCategory) {
		this.expenseByCategory = expenseByCategory;
	}

	public Double getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(Double totalIncome) {
		this.totalIncome = totalIncome;
	}

	public Double getTotalexpense() {
		return totalexpense;
	}

	public void setTotalexpense(Double totalexpense) {
		this.totalexpense = totalexpense;
	}

	public Double getTotalSaving() {
		return totalSaving;
	}

	public void setTotalSaving(Double totalSaving) {
		this.totalSaving = totalSaving;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	

}
