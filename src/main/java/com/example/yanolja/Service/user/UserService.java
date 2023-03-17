package com.example.yanolja.Service.user;

import com.example.yanolja.domain.user.User;

import java.util.Optional;

public interface UserService {
    User save(User user);

    Optional<User> findById(String id);

    void delete(String id);
}
