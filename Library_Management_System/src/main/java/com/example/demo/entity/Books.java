package com.example.demo.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Books")
public class Books {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	private int isbn;
	private String title;
	private String edition;
	private String category;
	private int price;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    //@JoinColumn(name = "publisher_id", nullable = false)
    private Publishers publishers;
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    //@JoinColumn(name = "author_id", nullable = false)
	private Author authors;
	
	
	public Books() {
		super();
	}


	


	public int getBook_id() {
		return book_id;
	}
	
	
	

	

	public Author getAuthors() {
		return authors;
	}

	public void setAuthors(Author authors) {
		this.authors = authors;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Publishers getPublishers() {
		return publishers;
	}
	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}


	

	public Books(int book_id, int isbn, String title, String edition, String category, int price) {
		super();
		this.book_id = book_id;
		this.isbn = isbn;
		this.title = title;
		this.edition = edition;
		this.category = category;
		this.price = price;
	}





	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", isbn=" + isbn + ", title=" + title + ", edition=" + edition
				+ ", category=" + category + ", price=" + price + ", publishers=" + publishers + "]";
	}
}
