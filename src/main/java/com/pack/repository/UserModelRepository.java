package com.pack.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.model.UserModel;

public interface UserModelRepository extends JpaRepository<UserModel, Integer>{
	
	public Optional<UserModel> findByUserName(String userName);
	
	@Query("select u from user u where u.userName = ?1 and u.password = ?2")
	public Optional<UserModel> findByUserNameAndPassword(String userName,String password);
	
}
