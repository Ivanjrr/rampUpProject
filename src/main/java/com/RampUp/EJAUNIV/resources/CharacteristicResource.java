package com.RampUp.EJAUNIV.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RampUp.EJAUNIV.entities.Characteristic;
import com.RampUp.EJAUNIV.services.CharacteristicService;

@RestController
@RequestMapping(value = "/characteristic")
public class CharacteristicResource {
	@Autowired
	private CharacteristicService service;
	
	@GetMapping
	public ResponseEntity<List<Characteristic>> findAll(){
		List<Characteristic> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Characteristic> findById(@PathVariable Integer id)	{
		Characteristic obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
