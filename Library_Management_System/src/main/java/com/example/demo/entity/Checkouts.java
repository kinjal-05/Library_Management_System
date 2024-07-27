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
@Table(name="Checkouts")
public class Checkouts {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int checkout_id;
	private LocalDate checkout_date;
	private LocalDate return_date;
	private LocalDate due_date;
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "book_id", nullable = false)
	private  Books books;
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "member_id", nullable = false)
	private  Member member;
	
	public Checkouts() {
		super();
	}
	public int getCheckout_id() {
		return checkout_id;
	}
	public void setCheckout_id(int checkout_id) {
		this.checkout_id = checkout_id;
	}
	public LocalDate getCheckout_date() {
		return checkout_date;
	}
	public void setCheckout_date(LocalDate checkout_date) {
		this.checkout_date = checkout_date;
	}
	public LocalDate getReturn_date() {
		return return_date;
	}
	public void setReturn_date(LocalDate return_date) {
		this.return_date = return_date;
	}
	public LocalDate getDue_date() {
		return due_date;
	}
	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
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
	public Checkouts(int checkout_id, LocalDate checkout_date, LocalDate return_date, LocalDate due_date, Books books,
			Member member) {
		super();
		this.checkout_id = checkout_id;
		this.checkout_date = checkout_date;
		this.return_date = return_date;
		this.due_date = due_date;
		this.books = books;
		this.member = member;
	}
	@Override
	public String toString() {
		return "Checkouts [checkout_id=" + checkout_id + ", checkout_date=" + checkout_date + ", return_date="
				+ return_date + ", due_date=" + due_date + ", books=" + books + ", member=" + member + "]";
	}
}
