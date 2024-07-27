package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;

public interface HoldsServices {
	List<Holds> getAllHolds();

    Optional<Holds> getHoldsById(Integer hold_id);
    
    void saveHolds(Holds holds);

    void deleteHolds(Integer hold_id);
}
