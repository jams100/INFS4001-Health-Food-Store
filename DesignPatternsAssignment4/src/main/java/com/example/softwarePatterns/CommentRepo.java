package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Integer>{
	Comment findByContent(String content);
}
