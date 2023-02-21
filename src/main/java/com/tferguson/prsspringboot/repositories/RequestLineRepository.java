package com.tferguson.prsspringboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tferguson.prsspringboot.entities.Request;
import com.tferguson.prsspringboot.entities.RequestLine;

public interface RequestLineRepository extends JpaRepository<RequestLine, Integer> {
	
	List<RequestLine> findByRequest(Request request);

}
