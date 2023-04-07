package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Accomdation_theme_mapping {
    @Id
    @Column(name = "mapping_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accomdtion_id")
    private Accomodation accomodation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theme_id")
    private AccomTheme accomTheme;
}
