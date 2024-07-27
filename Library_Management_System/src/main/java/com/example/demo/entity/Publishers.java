package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Publishers")
public class Publishers {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int publisher_id;
	private String name;
	
	
	public Publishers() {
		super();
	}

	
	

	public Publishers(int publisher_id, String name) {
		super();
		this.publisher_id = publisher_id;
		this.name = name;
	}




	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Publishers [publisher_id=" + publisher_id + ", name=" + name + "]";
	}
	
}
