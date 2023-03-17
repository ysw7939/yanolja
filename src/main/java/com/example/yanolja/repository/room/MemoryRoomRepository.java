package com.example.yanolja.repository.room;

import com.example.yanolja.domain.review.Review;
import com.example.yanolja.domain.room.Room;
import com.example.yanolja.domain.user.User;

import java.util.*;

public class MemoryRoomRepository implements RoomRepository {
    private static long sequence = 0L;
    private static final Map<Long, Room> store = new HashMap<>();

    @Override
    public Room save(Room room) {
        room.setId(++sequence);
        return store.put(room.getId(), room);
    }

    @Override
    public Optional<Room> findbyId(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Room> findbyAccommodationId(long accommodationId) {
        List<Room> allRoomList = new ArrayList<>(store.values());
        List<Room> roomList = new ArrayList<>();
        for (Room Room : allRoomList) {
            if (Room.getAccomoId() == accommodationId) {
                roomList.add(Room);
            }
        }
        return roomList;
    }
}
