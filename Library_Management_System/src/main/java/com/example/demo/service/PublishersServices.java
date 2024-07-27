package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;


public interface PublishersServices {
	List<Publishers> getAllPublishers();

    Optional<Publishers> getPublishersById(Integer publisher_id);
    Optional<Publishers> getPublishersByName(String name);
    void savePublishers(Publishers publishers);

    void deletePublishers(Integer publisher_id);
}
