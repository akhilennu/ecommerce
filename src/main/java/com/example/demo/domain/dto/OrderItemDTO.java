package com.example.demo.domain.dto;

import com.example.demo.domain.entity.OrderItem;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class OrderItemDTO {
	private Long id;
	
	private OrderDTO order;
	
	private ProductDTO product;
	
	@NotNull(message = "Quantity is required")
	@Min(value = 1, message = "Quantity must be at least 1")
	private Integer quantity;

	@NotNull(message = "Price is required")
	@Min(value = 0, message = "Price must be positive")
	private Double price;

	public OrderItemDTO(OrderItem item) {
		super();
		this.id = item.getId();
		this.order = new OrderDTO(item.getOrder());
		this.product = new ProductDTO(item.getProduct());
		this.quantity = item.getQuantity();
		this.price = item.getPrice();
	}

	public OrderItemDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
