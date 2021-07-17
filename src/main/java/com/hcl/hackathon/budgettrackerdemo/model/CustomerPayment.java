package com.hcl.hackathon.budgettrackerdemo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "fsa_customer_payments")
public class CustomerPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "customer_id")
	private Long customerid;

	@Column(name = "transaction_description")
	private String transactionDescription;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "payment_category")
	private String paymentCategory;

	@Column(name = "payment_Type")
	private String paymentType;

	@Column(name = "payment_Date")
	private Date paymentDate = new Date();
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transactionDescription, amount, customerid, id, paymentCategory, paymentDate, paymentType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerPayment other = (CustomerPayment) obj;
		return Objects.equals(transactionDescription, other.transactionDescription)
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(customerid, other.customerid) && Objects.equals(id, other.id)
				&& Objects.equals(paymentCategory, other.paymentCategory)
				&& Objects.equals(paymentDate, other.paymentDate) && Objects.equals(paymentType, other.paymentType);
	}

	@Override
	public String toString() {
		return "CustomerPayments [id=" + id + ", customerid=" + customerid + ", TransactionDescription="
				+ transactionDescription + ", amount=" + amount + ", paymentCategory=" + paymentCategory
				+ ", paymentType=" + paymentType + ", paymentDate=" + paymentDate + "]";
	}

}