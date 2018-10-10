package com.midas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midas.model.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	  List<Users> findAll();
    List<Users> findByName(String name);

}
