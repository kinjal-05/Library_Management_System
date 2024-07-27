package com.example.demo.service;



import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;
import java.util.List;
import java.util.Optional;
import com.example.demo.*;

import com.example.demo.*;
public interface AuthorServices {
	List<Author> getAllAuthor();

    Optional<Author> getAuthorById(Integer author_id);
    Optional<Author> getAuthorByName(String name);
    void saveAuthor(Author author);

    void deleteAuthor(Integer author_id);
}
