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
@RequestMapping("/api/members")
public class MemberController {
	@Autowired
    private MemberServicespl memberService;

    @GetMapping
    public List<Member> getAllMember() {
        return memberService.getAllMember();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Integer id) {
        return memberService.getMemberById(id)
                .orElseThrow(() -> new NoSuchElementException("Member not found with id " + id));
    }

    @PostMapping("/{name}")
    public Member getMemberByname(@PathVariable String name) {
        return memberService.getMemberByName(name)
                .orElseThrow(() -> new NoSuchElementException("Member not found with Name " + name));
    }
    
    
    
    
    
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        memberService.saveMember(member);
        return member;
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Integer id, @RequestBody Member updatedMember) {
        Member member = memberService.getMemberById(id)
                .orElseThrow(() -> new NoSuchElementException("Member not found with id " + id));

        // Update candidate fields
        member.setName(updatedMember.getName());
        //author.setDescription(updatedAuthor.getDescription());

        memberService.saveMember(member);
        return member;
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Integer id) {
        memberService.deleteMember(id);
    }
}

