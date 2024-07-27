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
@RequestMapping("/api/checkouts")
public class CheckoutsController {
	@Autowired
    private CheckoutsServicespl checkoutsService;

    @GetMapping
    public List<Checkouts> getAllCheckouts() {
        return checkoutsService.getAllCheckouts();
    }

    @GetMapping("/{id}")
    public Checkouts getAuthorById(@PathVariable Integer id) {
        return checkoutsService.getCheckoutsById(id)
                .orElseThrow(() -> new NoSuchElementException("Checkouts not found with id " + id));
    }

    @PostMapping
    public Checkouts createCheckouts(@RequestBody Checkouts checkouts) {
        checkoutsService.saveCheckouts(checkouts);
        return checkouts;
    }

    @PutMapping("/{id}")
    public Checkouts updateCheckouts(@PathVariable Integer id, @RequestBody Checkouts updatedCheckouts) {
        Checkouts checkouts = checkoutsService.getCheckoutsById(id)
                .orElseThrow(() -> new NoSuchElementException("Checkouts not found with id " + id));

        // Update candidate fields
        checkouts.setCheckout_date(updatedCheckouts.getCheckout_date());
        //author.setDescription(updatedAuthor.getDescription());

        checkoutsService.saveCheckouts(checkouts);
        return checkouts;
    }

    @DeleteMapping("/{id}")
    public void deleteCheckouts(@PathVariable Integer id) {
        checkoutsService.deleteCheckouts(id);
    }
}
