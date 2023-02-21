package com.tferguson.prsspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tferguson.prsspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
