package org.example.servletwebapp.service.impl;

import org.example.servletwebapp.models.Member;
import org.example.servletwebapp.service.MemberService;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService {
    private final List<Member> members;

    public MemberServiceImpl() {
        members = new ArrayList<>();
        members.add(new Member("John Doe", "Team Leader"));
        members.add(new Member("Jane Smith", "Developer"));
        members.add(new Member("Emily Johnson", "Designer"));
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }

    @Override
    public Member getMemberByName(String name) {
        return members.stream().filter(member -> member.getName().equals(name)).findFirst().orElse(null);
    }
}
