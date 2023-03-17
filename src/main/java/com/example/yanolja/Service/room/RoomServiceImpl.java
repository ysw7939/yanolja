package com.example.yanolja.Service.room;

import com.example.yanolja.domain.room.Room;
import com.example.yanolja.repository.room.RoomRepository;

import java.util.List;
import java.util.Optional;

public class RoomServiceImpl implements RoomServiece{
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Optional<Room> findbyId(long id) {
        Optional<Room> roomOptional = roomRepository.findbyId(id);
        if (roomOptional.isPresent()) {
            return roomOptional;
        }
        return Optional.empty();
    }

    @Override
    public List<Room> findbyAccommodationId(long accommodationId) {
        return roomRepository.findbyAccommodationId(accommodationId);
    }
}
