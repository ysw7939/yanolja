package com.example.yanolja.domain.user.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserSignUpDto {
    @NotEmpty
    private String name;
    @NotEmpty
    private String nickname;
    @NotEmpty
    private String loginId;
    @NotEmpty
    private String password;
    @NotEmpty
    private String phoneNumber;

    private String email;
}
