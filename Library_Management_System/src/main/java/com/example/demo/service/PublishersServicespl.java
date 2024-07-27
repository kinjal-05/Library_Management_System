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
public class PublishersServicespl implements PublishersServices {
	@Autowired
    private PublishersDao PublishersRepository;

    public List<Publishers> getAllPublishers() {
        return PublishersRepository.findAll();
    }

    public Optional<Publishers> getPublishersById(Integer publisher_id) {
        return PublishersRepository.findById(publisher_id);
    }

    public Optional<Publishers> getPublishersByName(String name) {
        // Check if PublishersRepository is not null before calling findByName
        if (PublishersRepository != null) {
            return PublishersRepository.findByName(name);
        } else {
            // Handle the case when PublishersRepository is null
            return Optional.empty();
        }
    }
    
    
    public void savePublishers(Publishers publishers) {
        PublishersRepository.save(publishers);
    }

    public void deletePublishers(Integer publisher_id) {
        PublishersRepository.deleteById(publisher_id);
    }
}
