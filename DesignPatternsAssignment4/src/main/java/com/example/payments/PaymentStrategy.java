package com.example.payments;

import com.example.softwarePatterns.Order;

public interface PaymentStrategy {
	Order paymentOperation(double amount);
}

