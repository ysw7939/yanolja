package com.example.yanolja.repository;

import com.example.yanolja.domain.user.User;

import java.util.List;
import java.util.Optional;

public class JPAUserRepository implements UserRepository{
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
