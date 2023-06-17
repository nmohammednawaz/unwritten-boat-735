package com.inventoryxpert.serviceimplementations;

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
import com.inventoryxpert.serviceinterfaces.AdminService;

public class AdminServiceImplement implements AdminService {

	@Override
	public void adminLogin(String username, String password)
			throws CannotConnectException, CannotCompleteTaskException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> viewAllCustomers()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerById(int customerId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int customerId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addProduct(Product product)
			throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public Product findProductById(int productId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int productId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> displayAllProducts()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBrand(Brand brand)
			throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBrand(int brandId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBrand(Brand brand)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCategory(Category category)
			throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategory(int categoryId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCategory(Category category)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addWareHouse(WareHouse wareHouse)
			throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteWareHouse(int wareHouseId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateWareHouse(WareHouse wareHouse)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStock(Stock stock)
			throws CannotConnectException, CannotCompleteTaskException, DuplicateDataException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStock(int stockId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStock(Stock stock)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Brand> viewAllBrands() throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Brand findBrandById(int brandId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> viewAllCategory()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findCategoryById(int categoryId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WareHouse> viewAllWareHouses()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WareHouse findWareHouseById(int wareHouseId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> viewAllStocks()
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock findStockById(int stockId)
			throws CannotConnectException, CannotCompleteTaskException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
