package com.example.yanolja.domain.room;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "room_theme")
public class RoomTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long themeId;
    @Column(nullable = false)
    private String theme;

    @ManyToMany
    @JoinTable(name = "room_theme_mapping",
            joinColumns = @JoinColumn(name = "theme_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id"))
    private List<Room> rooms = new ArrayList<Room>();
}
