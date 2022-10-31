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

	public ProductOffering insert(ProductOffering obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
			repository.deleteById(id);
	}
	
	public ProductOffering update(Integer id, ProductOffering obj){
		ProductOffering entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}
	
	private void updateData(ProductOffering entity, ProductOffering obj) {
		entity.setName(obj.getName());
		entity.setSellIndicator(obj.getSellIndicator());
		entity.setState(obj.getState());
		entity.setValidFor(obj.getValidFor());
		
	}
}

