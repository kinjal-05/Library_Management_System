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
@RequestMapping("/api/holds")
public class HoldsController {
	@Autowired
    private HoldsServicespl holdsService;

    @GetMapping
    public List<Holds> getAllHolds() {
        return holdsService.getAllHolds();
    }

    @GetMapping("/{id}")
    public Holds getHoldsById(@PathVariable Integer id) {
        return holdsService.getHoldsById(id)
                .orElseThrow(() -> new NoSuchElementException("Holds not found with id " + id));
    }

    @PostMapping
    public Holds createHolds(@RequestBody Holds holds) {
        holdsService.saveHolds(holds);
        return holds;
    }

    @PutMapping("/{id}")
    public Holds updateHolds(@PathVariable Integer id, @RequestBody Holds updatedHolds) {
        Holds holds = holdsService.getHoldsById(id)
                .orElseThrow(() -> new NoSuchElementException("Holds not found with id " + id));

        // Update candidate fields
        holds.setHold_status(updatedHolds.getHold_status());
        //author.setDescription(updatedAuthor.getDescription());

        holdsService.saveHolds(holds);
        return holds;
    }

    @DeleteMapping("/{id}")
    public void deleteHolds(@PathVariable Integer id) {
        holdsService.deleteHolds(id);
    }
}

