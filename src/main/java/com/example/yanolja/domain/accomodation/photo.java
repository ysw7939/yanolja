package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

@Entity
@Table(name = "accomdation_photo")
public class photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photo_id;
    @Column(nullable = false)
    private String photo;
}
