package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Accomdation_language_mapping {
    @Id @Column(name = "mapping_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "accomdtion_id")
    private Accomodation accomodation;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
}
