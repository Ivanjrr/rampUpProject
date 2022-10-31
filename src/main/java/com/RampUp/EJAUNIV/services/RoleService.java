package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Role;
import com.RampUp.EJAUNIV.repositories.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository repository;
	
	public List<Role> findAll() {
		return repository.findAll();
	}
	
	public Role findById(Integer id) {
		Optional<Role> obj = repository.findById(id);
		return obj.get();
	}
	
	public Role insert(Role obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
			repository.deleteById(id);
	}
	
	public Role update(Integer id, Role obj){
		Role entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}
	
	private void updateData(Role entity, Role obj) {
		entity.setAuthorities(obj.getAuthorities());
	}
}

