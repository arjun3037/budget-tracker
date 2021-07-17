package com.hcl.hackathon.budgettrackerdemo.controller;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.budgettrackerdemo.exception.QueryNotExistException;
import com.hcl.hackathon.budgettrackerdemo.model.BudgetTrackerRequest;
import com.hcl.hackathon.budgettrackerdemo.model.CustomerDataResponse;
import com.hcl.hackathon.budgettrackerdemo.processor.BudgetProcessor;

@RestController
public class BudgetTrackerController {
	
	
	@Autowired
	private BudgetProcessor processor;
	
	@GetMapping
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/budget-tracker/getTracker")
	public CustomerDataResponse getDataByIncomeOrExpense(@RequestBody BudgetTrackerRequest request) throws QueryNotExistException {
		return processor.process(request);
	}
	
	
	
	

}
