package org.example.servletwebapp.service;

import org.example.servletwebapp.models.Member;

import java.util.List;

public interface MemberService {
    List<Member> getMembers();
    Member getMemberByName(String name);
}
