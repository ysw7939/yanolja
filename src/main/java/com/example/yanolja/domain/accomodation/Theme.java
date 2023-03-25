package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

@Entity
@Table(name = "accomdation_theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long theme_id;
    @Column(nullable = false)
    private String theme;
}
