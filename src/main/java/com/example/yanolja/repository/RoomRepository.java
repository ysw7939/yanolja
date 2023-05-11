package com.example.yanolja.repository;

import com.example.yanolja.domain.room.Room;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RoomRepository {
    private final EntityManager em;

    public void save(Room room) {
        em.persist(room);
    }
}
