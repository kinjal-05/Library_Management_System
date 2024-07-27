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
@RequestMapping("/api/publishers")
public class PublishersController {
	@Autowired
    private PublishersServicespl publishersService;

    @GetMapping
    public List<Publishers> getAllPublishers() {
        return publishersService.getAllPublishers();
    }

    @GetMapping("/{id}")
    public Publishers getPublishersById(@PathVariable Integer id) {
        return publishersService.getPublishersById(id)
                .orElseThrow(() -> new NoSuchElementException("Publishers not found with id " + id));
    }
    
    @PostMapping("/{name}")
    public Publishers getPublishersByname(@PathVariable String name) {
        return publishersService.getPublishersByName(name)
                .orElseThrow(() -> new NoSuchElementException("Publishers not found with Name " + name));
    }
    
    
    
    
    

    @PostMapping
    public Publishers createPublishers(@RequestBody Publishers publishers) {
        publishersService.savePublishers(publishers);
        return publishers;
    }

    @PutMapping("/{id}")
    public Publishers updatePublishers(@PathVariable Integer id, @RequestBody Publishers updatedPublishers) {
        Publishers publishers = publishersService.getPublishersById(id)
                .orElseThrow(() -> new NoSuchElementException("Publishers not found with id " + id));

        // Update candidate fields
        publishers.setName(updatedPublishers.getName());
        //author.setDescription(updatedAuthor.getDescription());

        publishersService.savePublishers(publishers);
        return publishers;
    }

    @DeleteMapping("/{id}")
    public void deletePublishers(@PathVariable Integer id) {
        publishersService.deletePublishers(id);
    }
}
