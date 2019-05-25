package com.example.demo.modle;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="Product")
//  @EntityListeners(AuditingEntityListner.class)
public class Product {

	@Id
	private int productId;
	@NotBlank
	private String productName;
	@NotBlank
	private String description;
	@NotBlank
	private float price;
	


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
