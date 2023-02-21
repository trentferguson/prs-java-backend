package com.tferguson.prsspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tferguson.prsspringboot.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
