package com.inventoryxpert.serviceimplementations;

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
import com.inventoryxpert.serviceinterfaces.CustomerService;

public class CustomerServiceImplement implements CustomerService {

	@Override
	public void registerCustomer(Customer customer)
			throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginCustomer(String username, String password)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCustomerProfile(Customer customer)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int customerId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Order> viewMyOrders()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewMyTransactions()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewAllProducts()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> viewAllBrands()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> viewAllCategories()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProductToCart(Product product)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public Cart viewCart() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placeOrder(Order order)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

}
