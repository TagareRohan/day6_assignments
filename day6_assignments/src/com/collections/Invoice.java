package com.collections;

import java.io.Serializable;

public class Invoice implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int invoiceNumber;
	private String customerName;
	private double amount;
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", amount=" + amount
				+ "]";
	}
	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.amount = amount;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
