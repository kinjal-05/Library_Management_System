package com.example.demo.rest;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;

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


import com.example.demo.*;
@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	@Autowired
    private AuthorServicespl authorService;

    @GetMapping
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Integer id) {
        return authorService.getAuthorById(id)
                .orElseThrow(() -> new NoSuchElementException("Author not found with id " + id));
    }
    
    
    @PostMapping("/{name}")
    public Author getAuthorByName(@PathVariable String name) {
        return authorService.getAuthorByName(name)
                .orElseThrow(() -> new NoSuchElementException("Author not found with Name " + name));
    }
    

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
        return author;
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Integer id, @RequestBody Author updatedAuthor) {
        Author author = authorService.getAuthorById(id)
                .orElseThrow(() -> new NoSuchElementException("Author not found with id " + id));

        // Update candidate fields
        author.setName(updatedAuthor.getName());
        //author.setDescription(updatedAuthor.getDescription());

        authorService.saveAuthor(author);
        return author;
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        authorService.deleteAuthor(id);
    }
}
