package com.example.yanolja.domain.room;

import jakarta.persistence.*;

@Entity
@Table(name = "room_theme")
public class theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long themeId;
    @Column(nullable = false)
    private String theme;
}
