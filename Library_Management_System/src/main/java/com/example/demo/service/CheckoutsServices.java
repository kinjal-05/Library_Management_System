package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;
import java.util.List;
import java.util.Optional;



public interface CheckoutsServices {
	List<Checkouts> getAllCheckouts();

    Optional<Checkouts> getCheckoutsById(Integer checkout_id);

    void saveCheckouts(Checkouts checkouts);

    void deleteCheckouts(Integer checkout_id);
}
