package com.example.yanolja.repository;

import com.example.yanolja.domain.user.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public void save(User user) {
        em.persist(user);
    }

    public User findById(Long id) {
        return em.find(User.class, id);
    }

    public Optional<User> findByLoginId(String loginId) {
        return Optional.of(em.createQuery("select u from User u where loginId = :loginId", User.class)
                .setParameter("loginId", loginId)
                .getSingleResult());
    }

    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class)
                .getResultList();
    }
}
