package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accomodation_theme")
public class AccomTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long theme_id;
    @Column(nullable = false)
    private String theme;

    @OneToMany(mappedBy = "accomTheme")
    private List<Accomdation_theme_mapping> themeMappings = new ArrayList<>();
}
