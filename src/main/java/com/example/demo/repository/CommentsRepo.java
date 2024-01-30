package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Comments;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, String>{
	@Query("UPDATE Comments e SET e.upvote = e.upvote + 1 WHERE e.id = :id")
	void like(String id);
	
	
	@Query("UPDATE Comments e SET e.dislike = e.dislike + 1 WHERE e.id = :id")
	void dislike(String id);

}
