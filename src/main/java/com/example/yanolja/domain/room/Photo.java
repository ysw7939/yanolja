package com.example.yanolja.domain.room;

import com.example.yanolja.domain.accomodation.Accomodation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "room_photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoId;
    @Column
    private String photo;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
        if (!room.getPhotos().contains(this)) {
            room.getPhotos().add(this);
        }
    }
}
