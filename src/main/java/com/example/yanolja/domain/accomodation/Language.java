package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

@Entity
@Table(name = "accomdation_language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long languageId;
    @Column(nullable = false)
    private String language;
}
