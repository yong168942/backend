package com.bside.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bside.model.UserModel;

@Repository
public interface UserDao extends CrudRepository<UserModel, Integer> {
	
	UserModel findByUsername(String username);
	
}