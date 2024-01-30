package com.example.demo.service;

import javax.print.PrintService;

import com.example.demo.model.UserData;

public interface PatientServiceI  {

	void register(UserData userData);

	String signIn(String username, String password);

}
