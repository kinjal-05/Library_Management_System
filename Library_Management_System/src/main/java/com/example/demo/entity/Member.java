package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Member")
public class Member {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int member_id;
	private String name;
	private String address;
	private int phone_no;
	private String email;
	
	
	public Member() {
		super();
	}
	
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public Member(int member_id, String name, String address, int phone_no, String email) {
		super();
		this.member_id = member_id;
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", name=" + name + ", address=" + address + ", phone_no=" + phone_no
				+ ", email=" + email + "]";
	}
	
}
