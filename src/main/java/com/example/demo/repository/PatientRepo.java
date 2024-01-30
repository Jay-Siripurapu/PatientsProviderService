package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserData;

@Repository
public interface PatientRepo  extends JpaRepository<UserData, String>{
	
	UserData findByEmailAndPassword(String emailId,String password);

}
