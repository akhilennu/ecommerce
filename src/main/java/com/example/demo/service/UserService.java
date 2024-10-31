package com.example.demo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.dto.UserDTO;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.repository.UserRepository;
import com.example.demo.exception.UserNotFoundException;

@Service
@Transactional
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	private UserRepository userRepository;
//	private final BCryptPasswordEncoder passwordEncoder;

//	public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
//		super();
//		this.userRepository = userRepository;
//		this.passwordEncoder = passwordEncoder;
//	}
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public Optional<User> findByUsername(String username) {
		return userRepository.findOneByUsername(username);
	}

	public Optional<User> findByEmail(String email) {
		return userRepository.findOneByEmail(email);
	}

	public UserDTO createUser(UserDTO userDTO) {
		logger.info("Trying to create user providing userDTO {}", userDTO);
		User user = userDTO.toEntity();
//		String hashedPassword = passwordEncoder.encode(userDTO.getPassword());
//		user.setPassword(hashedPassword);
		return new UserDTO(save(user));
	}

	public UserDTO getUserByUsername(String username) {
		logger.info("Trying to get user by username {}", username);
		Optional<User> user = findByUsername(username);
		if (user.isPresent())
			return new UserDTO(user.get());
		else
			throw new UserNotFoundException(username);
	}
	
//	public boolean validatePassword(String rawPassword, String hashedPassword) {
//	    return passwordEncoder.matches(rawPassword, hashedPassword);
//	}

}
