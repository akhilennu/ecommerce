package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.UserDTO;
import com.example.demo.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

@RestController
@RequestMapping("/api/users")
public class UserResource {

	private UserService userService;

	public UserResource(UserService userService) { // to need to autowire when we bind with a constructor
		super();
		this.userService = userService;
	}

	@PostMapping
	@Operation(summary = "Create User", description = "Create a User by providing UserDTO")
	public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO userDTO) {
		UserDTO createdUser = userService.createUser(userDTO);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/{username}")
	@Operation(summary = "Get User By Username", description = "Get User by username")
	public ResponseEntity<UserDTO> getUserByUsername(@PathVariable @Size(min = 4, max = 20) @Valid String username) {
		UserDTO user = userService.getUserByUsername(username);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
