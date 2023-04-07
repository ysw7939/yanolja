package com.example.yanolja.domain.room;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room_theme_mapping {
    @Id
    @Column(name = "mapping_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "theme_id")
    private RoomTheme roomTheme;
}
