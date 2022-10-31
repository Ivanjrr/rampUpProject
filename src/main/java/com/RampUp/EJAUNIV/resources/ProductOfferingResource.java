package com.RampUp.EJAUNIV.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.RampUp.EJAUNIV.entities.ProductOffering;
import com.RampUp.EJAUNIV.services.ProductOfferingService;

@RestController
@RequestMapping(value = "/productoffering")
public class ProductOfferingResource {
	@Autowired
	private ProductOfferingService service;
	
	@GetMapping
	public ResponseEntity<List<ProductOffering>> findAll(){
		List<ProductOffering> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductOffering> findById(@PathVariable Integer id)	{
		ProductOffering obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<ProductOffering> insert(@RequestBody ProductOffering obj) {
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
			
			return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProductOffering> update(@PathVariable Integer id, @RequestBody ProductOffering obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}

