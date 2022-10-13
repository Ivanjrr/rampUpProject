package com.RampUp.EJAUNIV.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RampUp.EJAUNIV.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	public ResponseEntity<User> findAll(){
		User u = new User (1, "Jorge", "123456");
		return ResponseEntity.ok().body(u);
	}
}
