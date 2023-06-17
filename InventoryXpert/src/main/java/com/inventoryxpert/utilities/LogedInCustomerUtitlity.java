package com.inventoryxpert.utilities;

import com.inventoryxpert.entities.Customer;

public class LogedInCustomerUtitlity {
	private Customer loggedInCustomer;

	public LogedInCustomerUtitlity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LogedInCustomerUtitlity(Customer loggedInCustomer) {
		super();
		this.loggedInCustomer = loggedInCustomer;
	}

	public Customer getLoggedInCustomer() {
		return loggedInCustomer;
	}

	public void setLoggedInCustomer(Customer loggedInCustomer) {
		this.loggedInCustomer = loggedInCustomer;
	}
	
	
}
