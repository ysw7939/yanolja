package com.example.yanolja.controller;

import com.example.yanolja.domain.user.User;
import com.example.yanolja.domain.user.dto.UserDto;
import com.example.yanolja.domain.user.dto.UserSignUpDto;
import com.example.yanolja.service.UserService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/users/new")
    public CreateMemberResponse join(@Valid @RequestBody UserSignUpDto userSignUpDto) throws IllegalStateException {
        User user = new User();
        user.setEmail(userSignUpDto.getEmail());
        user.setName(userSignUpDto.getName());
        user.setPassword(userSignUpDto.getPassword());
        user.setLoginId(userSignUpDto.getLoginId());
        user.setPhoneNumber(userSignUpDto.getPhoneNumber());
        user.setNickName(userSignUpDto.getNickname());

        Long id = userService.join(user);
        return new CreateMemberResponse(id);
    }

    @Data
    static class CreateMemberResponse {
        private Long id;

        public CreateMemberResponse(Long id) {
            this.id = id;
        }
    }
}
