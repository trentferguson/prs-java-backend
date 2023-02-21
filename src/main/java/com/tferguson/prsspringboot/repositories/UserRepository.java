package com.tferguson.prsspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tferguson.prsspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsernameAndPassword(String username, String password);

}
