package com.inventoryxpert.userinterface;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.inventoryxpert.entities.Brand;
import com.inventoryxpert.entities.Customer;
import com.inventoryxpert.exceptions.CannotCompleteTaskException;
import com.inventoryxpert.exceptions.CannotConnectException;
import com.inventoryxpert.exceptions.DuplicateDataException;
import com.inventoryxpert.exceptions.NoRecordFoundException;
import com.inventoryxpert.serviceimplementations.AdminServiceImplement;
import com.inventoryxpert.serviceinterfaces.AdminService;

public class AdminUserInterface {
	
	private static void viewAllCustomer() {
		
		AdminService adminService = new AdminServiceImplement();
		
		try {
			List<Customer> customersList = adminService.viewAllCustomers();
			
			customersList.forEach(customer -> System.out.println(customer.getCustomerId()));
			
		}catch(CannotConnectException | CannotCompleteTaskException | NoRecordFoundException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
	private static void findCustomerById(Scanner sc) {

		System.out.print("Please Enter Customer Id To Fetch: ");
		int customerId = sc.nextInt();
		
		AdminService adminService = new AdminServiceImplement();
		
		try {
			Customer customer = adminService.findCustomerById(customerId);
			System.out.println(customer.getCustomerId());
			
		}catch(CannotConnectException | CannotCompleteTaskException | NoRecordFoundException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
	private static void deactivateCustomerAccount(Scanner sc) {
		
		System.out.print("Please Enter Customer Id To Deactivate: ");
		int customerId = sc.nextInt();
		
		AdminService adminService = new AdminServiceImplement();
		
		try {
			adminService.deleteCustomer(customerId);
			System.out.println("Customer Account Deactivated Successfully...!");
			
		}catch(CannotConnectException | CannotCompleteTaskException | NoRecordFoundException exception) {
			System.out.println(exception.getMessage());
		}
		
	}


	private static void viewAllBrands() {

		AdminService adminService = new AdminServiceImplement();
		
		try {
			List<Brand> brandsList = adminService.viewAllBrands();
			
			brandsList.forEach(brand -> System.out.println(brand.getBrandId()));
			
		}catch(CannotConnectException | CannotCompleteTaskException | NoRecordFoundException exception) {
			System.out.println(exception.getMessage());
		}
		
	}


	private static void addNewBrand(Scanner sc) {
		
		System.out.print("Please Enter Brand Name: ");
		String brandName = sc.nextLine();
		
		Brand brand = new Brand(brandName, new HashSet<>());
		AdminService adminService = new AdminServiceImplement();
		
		try {adminService.addBrand(brand);;
			System.out.println("Brand Added Successfully...!");
			
		}catch(CannotConnectException | CannotCompleteTaskException | DuplicateDataException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

//	private static void updateBrand(Scanner sc) {
//
//		System.out.print("Enter Brand Id To Be Updated: ");
//		int brandId = sc.nextInt();
//		System.out.print("Please Enter New Brand Name: ");
//		String brandName = sc.nextLine();
//		
//		AdminService adminService = new AdminServiceImplement();
//		Brand brand = new Brand();
//		try {
//			adminService.updateBrand(brand);
//			System.out.println("Brand Added Successfully...!");
//			
//		}catch(CannotConnectException | CannotCompleteTaskException | NoRecordFoundException exception) {
//			System.out.println(exception.getMessage());
//		}
//		
//	}
	
	private static void displayAdminFunctionalities() {
		System.out.println("1. View All Customers");
		System.out.println("2. Find Customer By Id");
		System.out.println("3. Deactive Customer Account");
		
		System.err.println("4. View All Brands");
		System.out.println("5. Add New Brand");
		System.out.println("6. Update Brand");
		System.out.println("7. Delete Brand");
		
		System.err.println("8. View All Categories");
		System.out.println("9. Add New Category");
		System.out.println("10. Update Category");
		System.out.println("11. Delete Category");
		
		System.err.println("12. View All Products");
		System.out.println("13. Add New Product");
		System.out.println("14. Update Product");
		System.out.println("15. Delete Product");
		
		System.err.println("16. View All Stocks");
		System.out.println("17. Add New Stock");
		System.out.println("18. Update Stock");
		System.out.println("19. Delete Stock");
		
		System.out.println("20. View All Warehouses");
		System.out.println("21. Add New Warehouse");
		System.out.println("22. Update Warehouse");
		System.out.println("23. Delete Warehouse");
		
		System.out.println("24. View All Orders");
		System.out.println("25. View All Transactions");
		System.out.println("26. View All Bills");
		
		System.out.println("0. Logout");
	}

	private static void adminFunctionalities(Scanner sc) {
		int adminChoice = 0;
		
		do {
			displayAdminFunctionalities();
			adminChoice = sc.nextInt();
			
			switch(adminChoice) {
				case 1:
					viewAllCustomer();
					break;
				case 2:
					findCustomerById(sc);
					break;
				case 3:
					deactivateCustomerAccount(sc);
					break;
				case 4:
					viewAllBrands();
					break;
				case 5:
					addNewBrand(sc);
					break;
				case 6:
//					updateBrand(sc);
					break;
				case 7:
//					deleteBrand(sc);
					break;
				case 8:
//					viewAllCategories();
					break;
				case 9:
//					addNewCategory(sc);
					break;
				case 10:
//					updateCategory(sc);
					break;
				case 11:
//					deleteCategory(sc);
					break;
				case 12:
//					viewAllProducts();
					break;
				case 13:
//					addNewProduct(sc);
					break;
				case 14:
//					updateProduct(sc);
					break;
				case 15:
//					deleteProduct(sc);
					break;
				case 16:
//					viewAllStocks();
					break;
				case 17:
//					addnewStock(sc);
					break;
				case 18:
//					updateStock(sc);
					break;
				case 19:
//					deleteStock(sc);
					break;
				case 20:
//					viewAllWarehouses();
					break;
				case 21:
//					addnewWarehouse(sc);
					break;
				case 22:
//					updateWarehouse(sc);
					break;
				case 23:
//					deleteWarehouse(sc);
					break;
				case 24:
//					viewAllOrders();
					break;
				case 25:
//					viewAllTransactions();
					break;
				case 26:
//					viewAllBills();
					break;
				case 0:
					System.out.println("Logged Out Successfully...!");
					App.main(null);
					break;
				default:
					System.out.println("🚫Please enter the correct preference and try again..!");
					break;
			}
		}while(adminChoice != 0);
		
		
		
	}


	public static void UserIsAdmin(Scanner sc) {
		
		System.out.println("Dear Admin, Please Enter Your Credentials To Login...!");
		System.out.print("Please Enter Your Username: ");
		String username = sc.next();
		System.out.print("Please Enter Your Password: ");
		String password = sc.next();
		
		AdminService adminService = new AdminServiceImplement();
		
		try {
			adminService.adminLogin(username, password);
			CommonlyUsedInterface.printWelcomeMessage("Admin");
			adminFunctionalities(sc);
		}catch(CannotConnectException | CannotCompleteTaskException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
