package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Comments {
	@Id
	private String commentId;
	private String desc;
	private String userName;
	private String hospital;
	private String location;
	private String dislikes;
	private String upvotes;

}
