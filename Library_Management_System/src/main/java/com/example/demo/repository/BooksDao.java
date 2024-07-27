package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;

@Repository
public interface BooksDao extends JpaRepository<Books,Integer>{
	Optional<Books> findFirstByCategory(String category);
}
