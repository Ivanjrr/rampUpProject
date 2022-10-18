package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.ProductOffering;
import com.RampUp.EJAUNIV.repositories.ProductOfferingRepository;

@Service
public class ProductOfferingService {
	
	@Autowired
	private ProductOfferingRepository repository;
	
	public List<ProductOffering> findAll() {
		return repository.findAll();
	}
	
	public ProductOffering findById(Integer id) {
		Optional<ProductOffering> obj = repository.findById(id);
		return obj.get();
	}

}
