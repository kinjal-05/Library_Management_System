package com.example.demo.entity;

import java.time.LocalDate;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Holds")
public class Holds {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hold_id;
	private LocalDate hold_date;
	private String hold_status;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    //@JoinColumn(name = "book_id", nullable = false)
	private Books books;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
   // @JoinColumn(name = "member_id", nullable = false)
	private Member member;
	
	public Holds() {
		super();
	}
	public int getHold_id() {
		return hold_id;
	}
	public void setHold_id(int hold_id) {
		this.hold_id = hold_id;
	}
	public LocalDate getHold_date() {
		return hold_date;
	}
	public void setHold_date(LocalDate hold_date) {
		this.hold_date = hold_date;
	}
	public String getHold_status() {
		return hold_status;
	}
	public void setHold_status(String hold_status) {
		this.hold_status = hold_status;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Holds(int hold_id, LocalDate hold_date, String hold_status, Books books, Member member) {
		super();
		this.hold_id = hold_id;
		this.hold_date = hold_date;
		this.hold_status = hold_status;
		this.books = books;
		this.member = member;
	}
	@Override
	public String toString() {
		return "Holds [hold_id=" + hold_id + ", hold_date=" + hold_date + ", hold_status=" + hold_status + ", books="
				+ books + ", member=" + member + "]";
	}
	
	
}
