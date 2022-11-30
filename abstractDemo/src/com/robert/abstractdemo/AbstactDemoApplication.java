package com.robert.abstractdemo;

import com.robert.abstractdemo.models.CashPayment;
import com.robert.abstractdemo.models.CreditCardPayment;

public class AbstactDemoApplication {

	public static void main(String[] args) {
//		Payment pay = new Payment(2.2);
		CashPayment laptop = new CashPayment(1999.99);
//		laptop.paymentDetails();
		
		CreditCardPayment rp = new CreditCardPayment(100.00, "456241562", "Tyler randall", "02/65");
		rp.paymentDetails();
	}

}
