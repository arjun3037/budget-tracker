package com.hcl.hackathon.budgettrackerdemo.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.hackathon.budgettrackerdemo.exception.QueryNotExistException;
import com.hcl.hackathon.budgettrackerdemo.model.BudgetTrackerRequest;
import com.hcl.hackathon.budgettrackerdemo.model.Constant;
import com.hcl.hackathon.budgettrackerdemo.model.CustomerDataResponse;

@Component
public class BudgetProcessor {
	
	@Autowired
	private TotalDataProcessor proTotalDataProcessor;
	
	public CustomerDataResponse process(BudgetTrackerRequest request) throws QueryNotExistException {
		if (Constant.INCOME_BY_CATEGROY.equals(request.getQueryType())) {
			return new IncomeProcessor().process(request);
		}else if (Constant.EXPENSE_BY_CATEGROY.equals(request.getQueryType())) {
			return new ExpenseProcessor().process(request);
		}else if (Constant.TOTAL_DATA.equals(request.getQueryType())) {
			return proTotalDataProcessor.process(request);
		}else {
			throw new QueryNotExistException("This Query Type is not Exist");
		}
		
	}

}
