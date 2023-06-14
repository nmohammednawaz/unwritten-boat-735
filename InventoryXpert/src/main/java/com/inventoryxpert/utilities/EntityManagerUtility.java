package com.inventoryxpert.utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtility {
	
	static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("inventoryXpert");
	}
	
	public static EntityManager openConnection() {
		return entityManagerFactory.createEntityManager();
	}
	
	public static void closeConnection(EntityManager entityManager) {
		if(entityManager != null) {
			entityManager.close();
		}
	}
}