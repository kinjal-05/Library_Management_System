package com.example.demo.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.*;
@Repository
public interface AuthorDao extends JpaRepository<Author,Integer>{
	Optional<Author> findByName(String name);
}

