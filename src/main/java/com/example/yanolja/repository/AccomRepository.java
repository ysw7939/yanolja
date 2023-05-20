package com.example.yanolja.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccomRepository {
    private EntityManager em;

    public void save(AccomRepository accomRepository) {
        em.persist(accomRepository);
    }

}
