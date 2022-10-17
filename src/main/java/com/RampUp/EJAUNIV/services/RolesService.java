package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Roles;
import com.RampUp.EJAUNIV.repositories.RolesRepository;

@Service
public class RolesService {
	
	@Autowired
	private RolesRepository repository;
	
	public List<Roles> findAll() {
		return repository.findAll();
	}
	
	public Roles findById(Integer id) {
		Optional<Roles> obj = repository.findById(id);
		return obj.get();
	}

}
