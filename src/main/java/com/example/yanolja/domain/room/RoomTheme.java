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

    @OneToMany(mappedBy = "roomTheme")
    private List<Room_theme_mapping> themeMappings = new ArrayList<>();
}
