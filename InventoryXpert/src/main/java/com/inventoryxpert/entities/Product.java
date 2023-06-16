package com.inventoryxpert.entities;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private int productQuantity;

    @ManyToMany(mappedBy = "productsList")
    private Set<Brand> brands;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private BigDecimal productPrice;

	public Product() {
		super();
	}

	public Product(String productName, int productQuantity, Set<Brand> brands, Category category,
			BigDecimal productPrice) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.brands = brands;
		this.category = category;
		this.productPrice = productPrice;
	}

	public Long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Set<Brand> getBrands() {
		return brands;
	}

	public void setBrands(Set<Brand> brands) {
		this.brands = brands;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
    
    
	
	
}
