package com.inventoryxpert.userinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.inventoryxpert.entities.Cart;
import com.inventoryxpert.entities.Customer;
import com.inventoryxpert.exceptions.CannotCompleteTaskException;
import com.inventoryxpert.exceptions.CannotConnectException;
import com.inventoryxpert.exceptions.DuplicateDataException;
import com.inventoryxpert.exceptions.NoRecordFoundException;
import com.inventoryxpert.serviceimplementations.CustomerServiceImplement;
import com.inventoryxpert.serviceinterfaces.CustomerService;

public class CustomerUserInterface {
	
	private static void customerRegister(Scanner sc) {
		
		System.out.print("Please Enter Your First Name: ");
		String customerFirstName = sc.nextLine();
		
		System.out.print("Please Enter Your Last Name: ");
		String customerLastName = sc.nextLine();
		
		System.out.print("Please Enter Your Email Address: ");
		String customerEmail = sc.next();
		
		System.out.print("Please Enter Your Username(Should Not Have Any Space Between It): ");
		String customerUsername = sc.next();
		
		System.out.print("Please Enter Your Password(Should Have Minimum Length Of 8 And Not Having Any Space): ");
		String customerPassword = sc.next();
		
		System.out.print("Please confirm password: ");
		String confirmPassword = sc.next();
		
		if(!confirmPassword.equals(customerPassword)) {
			do {
				System.out.println("Password Did'nt Match, Please Try Again");
				System.out.print("Please confirm password: ");
				confirmPassword = sc.next();
			}while(confirmPassword.equals(customerPassword));
		}
		
		System.out.print("Please enter your mobile number: ");
		int customerMobile = sc.nextInt();
		
		boolean customerIsActive = true;
		
		Customer customer = new Customer(customerIsActive, customerFirstName, customerLastName, customerEmail, customerMobile, customerUsername, customerPassword, new HashSet<>(), new HashSet<>(), new ArrayList<>(), new Cart());
		
		CustomerService customerService = new CustomerServiceImplement();
		try {
			customerService.registerCustomer(customer);
			System.out.println("🎉🎉🎉 Hurray! 🎉🎉🎉");
			System.out.println("You are Successfully Registered...!");
		}catch(CannotConnectException | CannotCompleteTaskException | DuplicateDataException exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	private static void customerLogin(Scanner sc) {
		System.out.print("Please Enter Your Username: ");
		String customerUsername = sc.next();
		System.out.print("Please Enter Your Password: ");
		String customerPassword = sc.next();
		
		try {
			CustomerService customerService = new CustomerServiceImplement();
			customerService.loginCustomer(customerUsername, customerPassword);
		}catch(CannotConnectException | CannotCompleteTaskException | NoRecordFoundException exception) {
			System.out.println(exception.getMessage());
		}
	}

	public static void UserIsCustomer(Scanner sc) {
		
		int customerchoice = 0;
    	
    	do {
    		System.out.println("1. Existing Customer");
    		System.out.println("2. New Customer");
    		System.out.println("0. Main");
    		System.out.print("Please Select Your Preference: ");
    		customerchoice = sc.nextInt();
    		
    		switch(customerchoice) {
	    		case 1:
					customerLogin(sc);
					break;
				case 2:
					customerRegister(sc);
					break;
    			case 0:
    				App.main(null);
    				break;
    			default:
    				System.out.println("🚫Please enter the correct preference and try again..!");
    				break;
    		}
    	}while(customerchoice != 0);
		
	}

}
