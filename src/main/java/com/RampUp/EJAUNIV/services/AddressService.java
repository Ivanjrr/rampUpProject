package com.RampUp.EJAUNIV.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RampUp.EJAUNIV.entities.Address;
import com.RampUp.EJAUNIV.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repository;
	
	public List<Address> findAll() {
		return repository.findAll();
	}
	
	public Address findById(Integer id) {
		Optional<Address> obj = repository.findById(id);
		return obj.get();
	}

	public Address insert(Address obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
			repository.deleteById(id);
	}
	
	public Address update(Integer id, Address obj){
		Address entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}
	
	private void updateData(Address entity, Address obj) {
		entity.setHouseNumber(obj.getHouseNumber());
		entity.setNeighborhood(obj.getNeighborhood());
		entity.setStreet(obj.getStreet());
		entity.setCountry(obj.getCountry());
		entity.setZipCode(obj.getZipCode());
		entity.setComplement(obj.getComplement());
		
	}
}