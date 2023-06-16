package com.inventoryxpert.daointerfaces;

import java.util.List;

import com.inventoryxpert.entities.Brand;
import com.inventoryxpert.entities.Category;
import com.inventoryxpert.entities.Customer;
import com.inventoryxpert.entities.Product;
import com.inventoryxpert.entities.Stock;
import com.inventoryxpert.entities.WareHouse;
import com.inventoryxpert.exceptions.CannotCompleteTaskException;
import com.inventoryxpert.exceptions.CannotConnectException;
import com.inventoryxpert.exceptions.DuplicateDataException;
import com.inventoryxpert.exceptions.NoRecordFoundException;

public interface AdminDao {
	
	void login(String username, String password) throws CannotConnectException, CannotCompleteTaskException;
	
//	----------------------------------- Customer Related Services --------------------------------
	
	List<Customer> viewAllCustomers() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	Customer findCustomerById(int customerId)  throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void deleteCustomer(int customerId)  throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	
	
//	----------------------------------- Product Related Services --------------------------------
	
	
	void addProduct(Product product) throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException;
	Product findProductById(int productId) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void updateProduct(Product product) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void deleteProduct(int productId) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	List<Product> displayAllProducts() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	
	
	
//	----------------------------------- Brand Related Services --------------------------------
	
	
	void addBrand(Brand brand) throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException;
	void deleteBrand(int brandId) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void updateBrand(Brand brand) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	
	
//	----------------------------------- Category Related Services --------------------------------
	
	void addCategory(Category category) throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException;
	void deleteCategory(int categoryId) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void updateCategory(Category category) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	
	
//	----------------------------------- WareHouse Related Services --------------------------------
	
	void addWareHouse(WareHouse wareHouse) throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException;
	void deleteWareHouse(int wareHouseId) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void updateWareHouse(WareHouse wareHouse) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	
	
//	----------------------------------- Stock Related Services --------------------------------
	
	void addStock(Stock stock) throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException;
	void deleteStock(int stockId) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	void updateStock(Stock stock) throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException;
	
	

}
