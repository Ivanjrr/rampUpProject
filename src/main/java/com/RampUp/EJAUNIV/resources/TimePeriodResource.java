package com.RampUp.EJAUNIV.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RampUp.EJAUNIV.entities.TimePeriod;
import com.RampUp.EJAUNIV.services.TimePeriodService;

@RestController
@RequestMapping(value = "/timeperiod")
public class TimePeriodResource {
	@Autowired
	private TimePeriodService service;
	
	@GetMapping
	public ResponseEntity<List<TimePeriod>> findAll(){
		List<TimePeriod> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<TimePeriod> findById(@PathVariable Integer id)	{
		TimePeriod obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
