package com.hcl.hackathon.budgettrackerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hackathon.budgettrackerdemo.repository.BudgetTrackerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BudgetTrackerService {
	
	@Autowired
	private BudgetTrackerRepository repository;
	
	
	public List<Object[]> incomeByCategory(){
		return repository.incomeDataGroupByCategory();
	}
	
	
	public List<Object[]> expenseByCategory(){
		return repository.expnenseDataGroupByCategory();
	}
	
	
	public Double totalIncome(Long CustomerId){		
		return repository.totalIncome(CustomerId);
	}
	
	
	public Double totalExpense(Long customerId){
		return repository.totalExpense(customerId);
	}
	

}
