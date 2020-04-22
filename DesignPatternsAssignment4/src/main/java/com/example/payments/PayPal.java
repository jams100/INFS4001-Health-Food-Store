package com.example.payments;

import com.example.softwarePatterns.Order;

public class PayPal implements PaymentStrategy{

	private String customerName;
	private String email;

	public PayPal() {}

	public PayPal(String customerName, String email) {
		this.customerName = customerName;
		this.email = email;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Order paymentOperation(double amount) {
		//Contact Paypal API in real world here...
		return new Order("success");
	}
}