package com.example.demo.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.domain.entity.Order;
import com.example.demo.domain.enums.OrderStatus;

public class OrderDTO {
	private OrderStatus status;
	private LocalDateTime createdAt = LocalDateTime.now();

	public OrderDTO(Order order) {
		super();
		this.status = order.getStatus();
		this.createdAt = order.getCreatedAt();
	}

	public OrderDTO() {
		super();
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
