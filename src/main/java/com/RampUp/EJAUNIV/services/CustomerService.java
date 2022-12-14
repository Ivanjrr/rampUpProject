package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Customer;
import com.RampUp.EJAUNIV.entities.User;
import com.RampUp.EJAUNIV.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> findAll() {
		return repository.findAll();
	}
	
	public Customer findById(Integer id) {
		Optional<Customer> obj = repository.findById(id);
		return obj.get();
	}

	public Customer insert(Customer obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
			repository.deleteById(id);
	}
	
	public Customer update(Integer id, Customer obj){
		Customer entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}
	
	private void updateData(Customer entity, Customer obj) {
		entity.setCustomerName(obj.getCustomerName());
		entity.setCustomerStatus(obj.getCustomerStatus());
		entity.setDocumentName(obj.getDocumentName());
		entity.setCreditScore(obj.getCreditScore());
		
	}
}
