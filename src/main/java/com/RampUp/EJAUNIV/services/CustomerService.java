package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Customer;
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

}
