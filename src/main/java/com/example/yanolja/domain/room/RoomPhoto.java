package com.example.yanolja.domain.room;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "room_photo")
public class RoomPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long photoId;
    @Column
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
        if (!room.getRoomPhotos().contains(this)) {
            room.getRoomPhotos().add(this);
        }
    }
}
