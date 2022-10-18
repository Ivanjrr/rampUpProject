package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Role;
import com.RampUp.EJAUNIV.repositories.RolesRepository;

@Service
public class RolesService {
	
	@Autowired
	private RolesRepository repository;
	
	public List<Role> findAll() {
		return repository.findAll();
	}
	
	public Role findById(Integer id) {
		Optional<Role> obj = repository.findById(id);
		return obj.get();
	}

}
