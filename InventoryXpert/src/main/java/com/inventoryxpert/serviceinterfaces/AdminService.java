package com.inventoryxpert.serviceinterfaces;

import com.inventoryxpert.exceptions.CannotCompleteTaskException;
import com.inventoryxpert.exceptions.CannotConnectException;

public interface AdminService {
	
	void login(String username, String password) throws CannotConnectException, CannotCompleteTaskException;
	
	
	
//	----------------------------------- Product Related Services --------------------------------
	
	
	
}
