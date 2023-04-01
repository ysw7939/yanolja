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

    @ManyToMany
    @JoinTable(name = "accomodation_theme_mapping",
            joinColumns = @JoinColumn(name = "theme_id"),
            inverseJoinColumns = @JoinColumn(name = "ACCOMDOATION_ID"))
    private List<Accomodation> accomodations = new ArrayList<Accomodation>();
}
