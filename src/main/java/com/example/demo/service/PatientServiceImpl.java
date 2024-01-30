package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UserData;
import com.example.demo.repository.PatientRepo;

public  class PatientServiceImpl  implements PatientServiceI{
	
	@Autowired
	PatientRepo patientRepo;

	@Override
	public void register(UserData userData) {
		patientRepo.save(userData);
		
	}

	@Override
	public String signIn(String username, String password) {
		if(patientRepo.findByEmailAndPassword(username, password) != null) {
			return "";
		}
		else {
			return "already exists";
		}
		
	}


}
