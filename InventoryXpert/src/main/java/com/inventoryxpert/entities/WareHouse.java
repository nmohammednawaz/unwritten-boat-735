package com.inventoryxpert.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class WareHouse {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseId;
    private String warehouseName;
    private String location;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private Set<Stock> stocks;

	public WareHouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WareHouse(String warehouseName, String location, Set<Stock> stocks) {
		super();
		this.warehouseName = warehouseName;
		this.location = location;
		this.stocks = stocks;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}
    
}
