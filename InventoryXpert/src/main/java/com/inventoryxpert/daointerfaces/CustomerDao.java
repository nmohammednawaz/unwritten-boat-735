package com.inventoryxpert.daointerfaces;

import java.util.List;

import com.inventoryxpert.entities.Brand;
import com.inventoryxpert.entities.Cart;
import com.inventoryxpert.entities.Category;
import com.inventoryxpert.entities.Customer;
import com.inventoryxpert.entities.Order;
import com.inventoryxpert.entities.Product;
import com.inventoryxpert.entities.Transaction;
import com.inventoryxpert.exceptions.CannotCompleteTaskException;
import com.inventoryxpert.exceptions.CannotConnectException;
import com.inventoryxpert.exceptions.DuplicateDataException;
import com.inventoryxpert.exceptions.NoRecordFoundException;

public interface CustomerDao {
	
	void registerCustomer(Customer customer) throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException;
	void loginCustomer(String username, String password) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void updateCustomerProfile(Customer customer) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void deleteCustomer(Customer customer) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	List<Order> viewMyOrders() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	List<Transaction> viewMyTransactions() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	List<Product> viewAllProducts() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	List<Brand> viewAllBrands() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	List<Category> viewAllCategories() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void addProductToCart(Product product) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	Cart viewCart() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void placeOrder(Order order) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;

}
