package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accomodation_poilcy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long policyId;
    @Column
    private String title;
    @Column
    private String content;
    @ManyToMany
    @JoinTable(name = "accomodation_policy_mapping",
            joinColumns = @JoinColumn(name = "policy_id"),
            inverseJoinColumns = @JoinColumn(name = "ACCOMDOATION_ID"))
    private List<Accomodation> accomodations = new ArrayList<Accomodation>();

}
