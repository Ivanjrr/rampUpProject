package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.User;
import com.RampUp.EJAUNIV.repositories.UserRepository;
import com.RampUp.EJAUNIV.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
			repository.deleteById(id);
	}
	
	public User update(Integer id, User obj){
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}
	
	private void updateData(User entity, User obj) {
		entity.setEmail(obj.getEmail());
		entity.setCustomer(obj.getCustomer());
	}
}

