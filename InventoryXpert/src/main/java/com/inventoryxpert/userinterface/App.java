package com.inventoryxpert.userinterface;

import java.util.Scanner;

public class App {
	
    public static void main( String[] args ){
    	
    	Scanner sc = new Scanner(System.in);
    	int choice = 0;
    	
    	do {
    		System.out.println("1. Administrator");
    		System.out.println("2. Customer");
    		System.out.println("0. Close");
    		System.out.print("Please Select Your Preference: ");
    		choice = sc.nextInt();
    		
    		switch(choice) {
    			case 1:
    				AdminUserInterface.UserIsAdmin(sc);
    				break;
    			case 2:
    				CustomerUserInterface.UserIsCustomer(sc);
    				break;
    			case 0:
    				System.out.println("Thank you for using our system, Have a great day!😊");
    				break;
    			default:
    				System.out.println("🚫Please enter the correct preference and try again..!");
    				break;
    		}
    	}while(choice != 0);
    	
    	sc.close();
    }
}
