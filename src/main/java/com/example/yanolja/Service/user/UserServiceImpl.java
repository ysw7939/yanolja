package com.example.yanolja.Service.user;

import com.example.yanolja.domain.user.User;
import com.example.yanolja.repository.user.UserRepository;

import java.util.Optional;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            return userOptional;
        }

        return Optional.empty();
    }

    @Override
    public void delete(String id) {
        userRepository.delete(id);
    }
}
