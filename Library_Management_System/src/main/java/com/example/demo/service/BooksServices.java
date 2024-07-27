package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;
import java.util.List;
import java.util.Optional;
import com.example.demo.*;

public interface BooksServices {
	List<Books> getAllBooks();

    Optional<Books> getBooksById(Integer book_id);
    Optional<Books> getBooksByCategory(String category);

    void saveBooks(Books books);

    void deleteBooks(Integer books_id);
}
