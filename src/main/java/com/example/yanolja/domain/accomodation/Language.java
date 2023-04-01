package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accomodation_language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long languageId;
    @Column(nullable = false)
    private String language;

    @ManyToMany
    @JoinTable(name = "accomodation_language_mapping",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "ACCOMDOATION_ID"))
    private List<Accomodation> accomodations = new ArrayList<Accomodation>();
}
