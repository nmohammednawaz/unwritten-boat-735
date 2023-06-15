package com.inventoryxpert.entities;

import java.util.List;
import java.util.Set;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String userName;
	private String password;
	
	private Set<Address> addresses;
	
	private Set<Transaction> transactions;
	
	private List<Order> ordersList;
	
}
