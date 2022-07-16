package org.example.domain;

public class Member {

    private String name;
    private String character;

    public Member(String name, String character) {
        this.name = name;
        this.character = character;
    }

    public Member() {

    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getCharacter() {return character;}
    public void setCharacter(String character) {this.character = character;}

}
