package com.example.yanolja.repository.user;

import com.example.yanolja.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryUserRepository implements UserRepository {
    private static long sequence = 0L;
    private static final Map<Long, User> store = new HashMap<>();

    public User save(User user) {
        user.setId(++sequence);
        store.put(user.getId(), user);
        return null;
    }


    public Optional<User> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }


    public void delete(String id) {
        store.remove(id);
    }
}
