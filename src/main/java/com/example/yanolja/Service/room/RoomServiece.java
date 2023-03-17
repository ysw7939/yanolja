package com.example.yanolja.Service.room;

import com.example.yanolja.domain.room.Room;

import java.util.List;
import java.util.Optional;

public interface RoomServiece {
    Room save(Room room);
    Optional<Room> findbyId(long id);

    List<Room> findbyAccommodationId(long accommodationId);
}
