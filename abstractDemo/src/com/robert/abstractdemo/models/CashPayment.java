package com.robert.abstractdemo.models;

import com.robert.abstractdemo.abstacts.Payment;

public class CashPayment extends Payment{

	public CashPayment(double amount) {
		super(amount);
	}

}
