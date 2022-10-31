package com.RampUp.EJAUNIV.entities;

import java.util.Date;
import java.util.Objects;

import com.RampUp.EJAUNIV.entities.enums.PaymentState;

public class BankSlipPayment extends Payment {

	private static final long serialVersionUID = 1L;
	
	private Date startDate;
	private Date dueDate;
	
	public BankSlipPayment() {
		
	}
	
	
	public BankSlipPayment(Integer id, PaymentState paymentState, Order order, Date startDate, Date dueDate) {
		super(id, paymentState, order);
		this.startDate = startDate;
		this.dueDate = dueDate;
	}


	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dueDate, startDate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankSlipPayment other = (BankSlipPayment) obj;
		return Objects.equals(dueDate, other.dueDate) && Objects.equals(startDate, other.startDate);
	}
	
	

}
