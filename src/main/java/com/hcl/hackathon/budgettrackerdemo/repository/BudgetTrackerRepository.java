package com.hcl.hackathon.budgettrackerdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.hackathon.budgettrackerdemo.model.CustomerPayment;

@Repository
public interface BudgetTrackerRepository extends JpaRepository<CustomerPayment, Long> {
	
	
	  @Query("select c.paymentCategory , count(*) from CustomerPayment c where c.paymentType = 'CREDIT' group by paymentCategory")
	  List<Object[]> incomeDataGroupByCategory();
	  
	  @Query("select c.paymentCategory , count(*) from CustomerPayment c where c.paymentType = 'DEBIT' group by paymentCategory")
	  List<Object[]> expnenseDataGroupByCategory();
	  
	  @Query("select sum(c.amount) from CustomerPayment c where c.paymentType = 'CREDIT' and c.customerid=:customerId")
	  Double totalIncome(Long customerId);

	  @Query("select sum(c.amount) from CustomerPayment c where c.paymentType = 'DEBIT' and c.customerid=:customerId")
	  Double totalExpense(Long customerId);
	  
	

}
