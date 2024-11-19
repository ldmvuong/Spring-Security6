package com.example.Security6.ldmv.model;

import lombok.Data;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private boolean enabled;
}