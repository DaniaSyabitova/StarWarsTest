package org.example.repository;

import org.example.domain.Member;
import java.util.Collection;

public interface MemberRepos {

    public Collection<Member> getAllMembers();
    public Member createMember(Member member);

    public Member getMember(Member member);

    // public void deleteAllMembers();  в базе однажды - в базе навсегда

}
