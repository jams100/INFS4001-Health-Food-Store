package com.example.softwarePatterns;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Comment {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	String content;
	int rating;
	
//	@ManyToOne
//	StockItem stockItem;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
