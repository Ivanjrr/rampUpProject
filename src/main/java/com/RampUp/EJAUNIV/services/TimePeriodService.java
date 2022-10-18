package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.TimePeriod;
import com.RampUp.EJAUNIV.repositories.TimePeriodRepository;

@Service
public class TimePeriodService {
	
	@Autowired
	private TimePeriodRepository repository;
	
	public List<TimePeriod> findAll() {
		return repository.findAll();
	}
	
	public TimePeriod findById(Integer id) {
		Optional<TimePeriod> obj = repository.findById(id);
		return obj.get();
	}

}
