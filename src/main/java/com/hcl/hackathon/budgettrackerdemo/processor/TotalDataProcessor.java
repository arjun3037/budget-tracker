package com.hcl.hackathon.budgettrackerdemo.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.hackathon.budgettrackerdemo.model.BudgetTrackerRequest;
import com.hcl.hackathon.budgettrackerdemo.model.CustomerDataResponse;
import com.hcl.hackathon.budgettrackerdemo.service.BudgetTrackerService;

@Component
public class TotalDataProcessor{
	
	Logger logger = LoggerFactory.getLogger(TotalDataProcessor.class);
	
	@Autowired
	private BudgetTrackerService service;

	
	public CustomerDataResponse process(BudgetTrackerRequest request) {
		logger.info("TotalDataProcessor starts the processing for category - {}", request.getCategory());
		Double totalExpense = service.totalExpense(request.getCustomerId());
		Double totalIncome = service.totalIncome(request.getCustomerId()) == null ? 1000d : service.totalIncome(request.getCustomerId());
		Double totalSaving  = totalIncome-totalExpense;
		CustomerDataResponse customerDataResponse = new CustomerDataResponse();
		customerDataResponse.setCustomerId(request.getCustomerId());
		customerDataResponse.setCategory(request.getCategory());
		customerDataResponse.setTotalexpense(totalExpense);
		customerDataResponse.setTotalexpense(totalExpense);
		customerDataResponse.setTotalSaving(totalSaving);
		return customerDataResponse;
	}
	
	
}
