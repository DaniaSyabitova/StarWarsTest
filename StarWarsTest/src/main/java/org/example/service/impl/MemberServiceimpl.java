package org.example.service.impl;

import org.example.domain.Member;
import org.example.repository.MemberRepos;
import org.example.repository.impl.MemberJdbcRepos;
import org.example.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

@Service
public class MemberServiceimpl implements MemberService {

    private final MemberRepos memrep;  //сервис
    public MemberServiceimpl(MemberRepos memrep) {
        this.memrep = memrep;
    }  //

    @Override
    public Collection<Member> getAllMembers() {
        return memrep.getAllMembers();
    }

    @Override
    public Member getMember(Member member) {
        return memrep.getMember(member);
    }

    @Override
    public Member createMember(Member member) {
        return memrep.createMember(member);
    }

   /* @Override
    public void deleteAllMembers() {
        memrep.deleteAllMembers();  в базе однажды - в базе навсегда
    }*/
}
