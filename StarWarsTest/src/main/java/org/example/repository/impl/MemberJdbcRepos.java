package org.example.repository.impl;

import org.example.domain.Member;
import org.example.repository.MemberRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@Repository
public class MemberJdbcRepos implements MemberRepos {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MemberJdbcRepos(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Collection<Member> getAllMembers() {
        return jdbcTemplate.query("SELECT * FROM member", new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Member(rs.getString("name"), rs.getString("character"));
            }
        });
    }

    @Override
    public Member createMember(Member member) {
        jdbcTemplate.update("INSERT INTO member(name, character) VALUES (?,?)", member.getName() , member.getCharacter()  );
        return member;
    }

   /* @Override
    public void deleteAllMembers() {
        jdbcTemplate.update("DELETE FROM member");  в базе однажды - в базе навсегда
    }*/

    @Override
    public Member getMember(Member member) {
        return null;
    }
}
