package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.*;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;
@Service
public class AuthorServicespl implements AuthorServices {
	@Autowired
    private AuthorDao AuthorRepository;

    public List<Author> getAllAuthor() {
        return AuthorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Integer author_id) {
        return AuthorRepository.findById(author_id);
    }

    public Optional<Author> getAuthorByName(String name) {
        // Check if PublishersRepository is not null before calling findByName
        if (AuthorRepository != null) {
            return AuthorRepository.findByName(name);
        } else {
            // Handle the case when PublishersRepository is null
            return Optional.empty();
        }
    }
    
    
    public void saveAuthor(Author author) {
        AuthorRepository.save(author);
    }

    public void deleteAuthor(Integer author_id) {
        AuthorRepository.deleteById(author_id);
    }
}
