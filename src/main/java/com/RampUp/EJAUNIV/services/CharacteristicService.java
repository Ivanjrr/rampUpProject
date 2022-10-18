package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Characteristic;
import com.RampUp.EJAUNIV.repositories.CharacteristicRepository;

@Service
public class CharacteristicService {
	
	@Autowired
	private CharacteristicRepository repository;
	
	public List<Characteristic> findAll() {
		return repository.findAll();
	}
	
	public Characteristic findById(Integer id) {
		Optional<Characteristic> obj = repository.findById(id);
		return obj.get();
	}

}
