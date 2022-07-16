package org.example.service;

import org.example.domain.Member;
import org.example.repository.MemberRepos;
import org.example.service.impl.MemberServiceimpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MemberServiceTest {

    @Test
    void testSaveMember(){
        Collection<Member> members = new ArrayList<>();
        MemberRepos storage = Mockito.mock(MemberRepos.class);
        MemberService memberService = new MemberServiceimpl(storage);


        Member member = new Member();
        member.setName("Дания");
        member.setCharacter("Оби - Ван Кеноби");

        Mockito.when(storage.getMember(member)).thenReturn(member);

        Member returnedMember = memberService.getMember(member);

        assertThat(returnedMember.getName()).isEqualTo(member.getName());
        assertThat(returnedMember.getCharacter()).isEqualTo(member.getCharacter());

    }


}
