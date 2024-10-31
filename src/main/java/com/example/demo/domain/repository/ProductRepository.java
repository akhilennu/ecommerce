package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.OrderItem;

@Repository
public interface ProductRepository extends JpaRepository<OrderItem, Long> {

}
