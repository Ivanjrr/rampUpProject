package com.RampUp.EJAUNIV.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RampUp.EJAUNIV.entities.Customer;
import com.RampUp.EJAUNIV.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerResource {
	@Autowired
	private CustomerService service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> findAll(){
		List<Customer> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Customer> findById(@PathVariable Integer id)	{
		Customer obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
