package com.example.demo.rest;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;
import com.example.demo.*;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/books")
public class BooksController {
	@Autowired
    private BooksServicespl booksService;

    @GetMapping
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Books getBooksById(@PathVariable Integer id) {
        return booksService.getBooksById(id)
                .orElseThrow(() -> new NoSuchElementException("Books not found with id " + id));
    }
    
    @PostMapping("/{category}")
    public Books getBooksByCategory(@PathVariable String category) {
        return booksService.getBooksByCategory(category)
                .orElseThrow(() -> new NoSuchElementException("Books not found with Category " + category));
    }
    
    
    

    @PostMapping
    public Books createBooks(@RequestBody Books books) {
        booksService.saveBooks(books);
        return books;
    }

    @PutMapping("/{id}")
    public Books updateBooks(@PathVariable Integer id, @RequestBody Books updatedBooks) {
        Books books = booksService.getBooksById(id)
                .orElseThrow(() -> new NoSuchElementException("Books not found with id " + id));

        // Update candidate fields
        books.setTitle(updatedBooks.getTitle());
        //author.setDescription(updatedAuthor.getDescription());

        booksService.saveBooks(books);
        return books;
    }

    @DeleteMapping("/{id}")
    public void deleteBooks(@PathVariable Integer id) {
        booksService.deleteBooks(id);
    }
}
