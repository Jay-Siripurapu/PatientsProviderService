package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserData {
	@Id
	private String name;
	private String email;
	private String mobile;
	private String password;

}
