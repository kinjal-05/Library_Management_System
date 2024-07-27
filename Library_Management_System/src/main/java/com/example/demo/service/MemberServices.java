package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.rest.*;
import com.example.demo.service.*;


public interface MemberServices {
	List<Member> getAllMember();

    Optional<Member> getMemberById(Integer member_id);
    Optional<Member> getMemberByName(String name);

    void saveMember(Member member);

    void deleteMember(Integer member_id);
}
