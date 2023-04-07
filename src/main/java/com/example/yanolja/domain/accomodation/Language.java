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

    @OneToMany(mappedBy = "language")
    private List<Accomdation_language_mapping> languageMappings = new ArrayList<>();
}
