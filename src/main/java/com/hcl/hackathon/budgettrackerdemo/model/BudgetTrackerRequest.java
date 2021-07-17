package com.hcl.hackathon.budgettrackerdemo.model;

public class BudgetTrackerRequest {
	
	private Long customerId;
	
	private String category;
	private String queryType;
	

	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getQueryType() {
		return queryType;
	}


	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	
	

}
