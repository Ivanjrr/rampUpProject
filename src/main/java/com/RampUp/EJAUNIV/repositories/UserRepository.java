package com.RampUp.EJAUNIV.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RampUp.EJAUNIV.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
