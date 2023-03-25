package com.example.yanolja.domain.review;

import jakarta.persistence.*;

@Entity
@Table(name = "review_photo")
public class photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoId;
    @Column(nullable = false)
    private String photo;

}
