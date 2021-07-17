package com.hcl.hackathon.budgettrackerdemo.processor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.hackathon.budgettrackerdemo.model.BudgetTrackerRequest;
import com.hcl.hackathon.budgettrackerdemo.model.Constant;
import com.hcl.hackathon.budgettrackerdemo.model.CustomerDataResponse;
import com.hcl.hackathon.budgettrackerdemo.service.BudgetTrackerService;

@Component
public class IncomeProcessor {
	
Logger logger = LoggerFactory.getLogger(TotalDataProcessor.class);
	
	@Autowired
	private BudgetTrackerService service;
	
	public CustomerDataResponse process(BudgetTrackerRequest request) {
		logger.info("IncomeProcessor starts the processing for category - {}", request.getCategory());
		List<Object[]> incomeByCategory = service.incomeByCategory();
		Map<String, BigDecimal> expData = incomeByCategory.stream().collect(Collectors.toMap(a -> (String)a[0], b->(BigDecimal)b[1]));
		CustomerDataResponse customerDataResponse = new CustomerDataResponse();
		customerDataResponse.setCustomerId(request.getCustomerId());
		customerDataResponse.setCategory(request.getCategory());
		customerDataResponse.setExpenseByCategory(expData);
		return customerDataResponse;
	}

	public String getQueryType() {
		return Constant.INCOME_BY_CATEGROY;
	}

}
