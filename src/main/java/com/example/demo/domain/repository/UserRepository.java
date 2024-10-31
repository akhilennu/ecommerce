package com.example.demo.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findOneByUsername(String name);

	Optional<User> findOneByEmail(String email);

}
