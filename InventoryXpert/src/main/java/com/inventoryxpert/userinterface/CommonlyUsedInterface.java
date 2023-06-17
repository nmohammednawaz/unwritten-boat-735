package com.inventoryxpert.userinterface;

public class CommonlyUsedInterface {
	
//	Prints the welcome message for specific user type
	static void printWelcomeMessage(String user) {
		System.out.println("Hey 👋 " + user + "..! Welcome");
	}
	
//	Prints Space
	public static void printSpace(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}
	
//	prints Star
	public static void printStar(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
