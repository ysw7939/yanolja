package com.example.yanolja.service;

import com.example.yanolja.domain.user.User;
import com.example.yanolja.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    //회원 가입
    public Long join(User user) {
        validateUserId(user);
        userRepository.save(user);
        return user.getId();
    }

    private void validateUserId(User user) {
        List<User> userOptional = userRepository.findByLoginId(user.getLoginId());
        if (!userOptional.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 아이디 입니다.");
        }
    }

    public List<User> findUsers() {return userRepository.findAll();}
    public User findOne(Long userId){return userRepository.findById(userId);}


}
