package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accomdation_language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long languageId;
    @Column(nullable = false)
    private String language;

    @ManyToMany
    @JoinTable(name = "accomdation_language_mapping",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "accomdation_id"))
    private List<Accomodation> accomodations = new ArrayList<Accomodation>();
}
