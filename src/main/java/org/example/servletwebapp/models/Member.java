package org.example.servletwebapp.models;

public class Member {
    private String name;
    private String info;

    public Member(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
