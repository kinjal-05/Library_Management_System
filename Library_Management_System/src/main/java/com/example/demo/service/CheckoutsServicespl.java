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
public class CheckoutsServicespl implements CheckoutsServices {
	@Autowired
    private CheckoutsDao CheckoutsRepository;

    public List<Checkouts> getAllCheckouts() {
        return CheckoutsRepository.findAll();
    }

    public Optional<Checkouts> getCheckoutsById(Integer checkout_id) {
        return CheckoutsRepository.findById(checkout_id);
    }

    public void saveCheckouts(Checkouts checkouts) {
        CheckoutsRepository.save(checkouts);
    }

    public void deleteCheckouts(Integer checkout_id) {
        CheckoutsRepository.deleteById(checkout_id);
    }
}
