package com.tferguson.prsspringboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tferguson.prsspringboot.entities.Vendor;
import com.tferguson.prsspringboot.repositories.VendorRepository;

@RestController
@RequestMapping("/vendors")
public class VendorController {
	
	@Autowired
	private VendorRepository vendorRepo;
	
	@GetMapping("")
	public List<Vendor> getAll() {
		
		List<Vendor> vendors = vendorRepo.findAll();
		
		return vendors;
		
	}
	
	@GetMapping("/{id}")
	public Vendor getById(@PathVariable int id) {
		
		Vendor vendor = new Vendor();
		
		Optional<Vendor> optionalVendor = vendorRepo.findById(id);
		
		if(optionalVendor.isPresent()) {
			vendor = optionalVendor.get();
		}
		
		return vendor;
	}
	
	@PutMapping("")
	public Vendor update(@RequestBody Vendor updatedVendor) {
		
		Vendor vendor = new Vendor();
		
		boolean vendorExists = vendorRepo.findById(updatedVendor.getId()).isPresent();
		
		if(vendorExists) {
			vendor = vendorRepo.save(updatedVendor);
		}
		
		return vendor;
	}


}
