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
public class MemberServicespl implements MemberServices {
	@Autowired
    private MemberDao MemberRepository;

    public List<Member> getAllMember() {
        return MemberRepository.findAll();
    }

    public Optional<Member> getMemberById(Integer member_id) {
        return MemberRepository.findById(member_id);
    }

    public Optional<Member> getMemberByName(String name) {
        // Check if PublishersRepository is not null before calling findByName
        if (MemberRepository != null) {
            return MemberRepository.findByName(name);
        } else {
            // Handle the case when PublishersRepository is null
            return Optional.empty();
        }
    }
    
    
    
    
    
    
    
    public void saveMember(Member member) {
        MemberRepository.save(member);
    }

    public void deleteMember(Integer member_id) {
        MemberRepository.deleteById(member_id);
    }
}
