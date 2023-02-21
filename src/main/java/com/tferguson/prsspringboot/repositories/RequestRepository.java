package com.tferguson.prsspringboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tferguson.prsspringboot.entities.Request;

public interface RequestRepository extends JpaRepository<Request, Integer> {
	
	List<Request> findByStatusAndUserIdNot (String status, int userID);

}
