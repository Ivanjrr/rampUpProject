package com.RampUp.EJAUNIV.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.RampUp.EJAUNIV.entities.User;
import com.RampUp.EJAUNIV.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
	User u1 = new User(null, "Elias@gmail.com", "141415" );
	User u2 = new User(null, "Rodolfo@gmail.com", "141415" );
	
	userRepository.saveAll(Arrays.asList(u1,u2));
	}
}