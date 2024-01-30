package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.CommentsRepo;

public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	CommentsRepo commentsRepo;

	@Override
	public void upvote(String id) {
		commentsRepo.like(id);
		
	}

	@Override
	public void dislike(String id) {
        commentsRepo.dislike(id);		
	}

}
