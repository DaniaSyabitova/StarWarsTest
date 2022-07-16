package org.example.service;

import org.example.domain.Member;

import java.util.Collection;

public interface MemberService {

    public Collection<Member> getAllMembers();

    public Member getMember(Member member);
    public Member createMember(Member member);

   // public void deleteAllMembers();  в базе однажды - в базе навсегда

}
