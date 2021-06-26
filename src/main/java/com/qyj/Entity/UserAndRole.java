package com.qyj.Entity;

import lombok.Data;

@Data
public class UserAndRole {

    private int userId;
    private String username;
    private String nickname;
    private String password;
    private String mobile;
    private String email;
    private String address;
    private String role;
}
