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
public class HoldsServicespl implements HoldsServices {
	@Autowired
    private HoldsDao HoldsRepository;

    public List<Holds> getAllHolds() {
        return HoldsRepository.findAll();
    }

    public Optional<Holds> getHoldsById(Integer hold_id) {
        return HoldsRepository.findById(hold_id);
    }
    
    
  
    
    
    

    public void saveHolds(Holds holds) {
        HoldsRepository.save(holds);
    }

    public void deleteHolds(Integer hold_id) {
        HoldsRepository.deleteById(hold_id);
    }
}
