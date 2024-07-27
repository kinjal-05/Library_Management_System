package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Author")
public class Author {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int author_id;
	private String name;
	
	
	public Author() {
		super();
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public Author(int author_id, String name) {
		super();
		this.author_id = author_id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", name=" + name + "]";
	}
	
}
