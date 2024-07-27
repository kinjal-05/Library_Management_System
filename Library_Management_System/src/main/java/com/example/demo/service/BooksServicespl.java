package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;

@Service
public class BooksServicespl implements BooksServices {
	@Autowired
    private BooksDao BooksRepository;

    public List<Books> getAllBooks() {
        return BooksRepository.findAll();
    }

    public Optional<Books> getBooksById(Integer book_id) {
        return BooksRepository.findById(book_id);
    }
    
    public Optional<Books> getBooksByCategory(String category) {
        // Check if PublishersRepository is not null before calling findByName
        if (BooksRepository != null) {
            return BooksRepository.findFirstByCategory(category);
        } else {
            // Handle the case when PublishersRepository is null
            return Optional.empty();
        }
    }
    
    

    public void saveBooks(Books books) {
        BooksRepository.save(books);
    }

    public void deleteBooks(Integer book_id) {
        BooksRepository.deleteById(book_id);
    }
}
