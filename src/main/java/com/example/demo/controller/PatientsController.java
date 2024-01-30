package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.UserData;
import com.example.demo.repository.CommentsRepo;
import com.example.demo.service.CommentsService;
import com.example.demo.service.PatientServiceI;

@Controller
@RequestMapping("/user")
public class PatientsController {
	
	@Autowired
	PatientServiceI patientService;
	
	@Autowired
	CommentsService commentsService;
	
	
	@RequestMapping("/register")
	public void userRegistration(@RequestBody UserData userData) {
		patientService.register(userData);
	}
	
	@RequestMapping("/signIn")
	public String signIn(String username, String password) {
		return patientService.signIn(username,password);
	}
	
	@RequestMapping("/upvotes")
	public void upvotes(String id) {
		commentsService.upvote(id);
	}
	
	@RequestMapping("/dislike")
	public void dislike(String id) {
		commentsService.dislike(id);
	}

}
