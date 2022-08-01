package com.example.SecurityExample.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SecurityExample.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
}
