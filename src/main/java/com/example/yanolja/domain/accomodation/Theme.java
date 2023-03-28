package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accomdation_theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long theme_id;
    @Column(nullable = false)
    private String theme;

    @ManyToMany
    @JoinTable(name = "accomdation_theme_mapping",
            joinColumns = @JoinColumn(name = "theme_id"),
            inverseJoinColumns = @JoinColumn(name = "accomdation_id"))
    private List<Accomodation> accomodations = new ArrayList<Accomodation>();
}
