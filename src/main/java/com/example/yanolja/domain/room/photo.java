package com.example.yanolja.domain.room;

import jakarta.persistence.*;

@Entity
@Table(name = "room_photo")
public class photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoId;
    @Column
    private String photo;
}
