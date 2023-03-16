package com.example.yanolja.repository.user;

import com.example.yanolja.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(String id);

    void delete(String id);

}
