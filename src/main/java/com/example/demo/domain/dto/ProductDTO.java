package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductDTO {
	private Long id;
	
	@NotBlank(message = "Product name is required")
	private String name;
	
	private String description;
	
	@NotNull(message = "Price is required")
    @Min(value = 0, message = "Price must be positive")
	private Double price;
	
	@NotNull(message = "Quantity is required")
    @Min(value = 0, message = "Quantity must be positive")
	private Integer quantity;

	public ProductDTO(Product product) {
		super();
		this.id = product.getId();
		this.name = product.getName();
		this.description = product.getDescription();
		this.price = product.getPrice();
		this.quantity = product.getQuantity();
	}

	public ProductDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
