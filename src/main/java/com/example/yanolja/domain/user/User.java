package com.example.yanolja.domain.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private long id;
    private String name;
    private String nickName;
    private int point;
    private String userId;
    private String password;
    private int phoneNumber;
    private String email;

    public User() {
    }

    public User(String name, String nickName, int point, String userId, String password, int phoneNumber, String email) {
        this.name = name;
        this.nickName = nickName;
        this.point = point;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
