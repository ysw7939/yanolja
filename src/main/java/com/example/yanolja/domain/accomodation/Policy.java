package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accomdation_poilcy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long policyId;
    @Column
    private String title;
    @Column
    private String content;
    @ManyToMany
    @JoinTable(name = "accomdation_policy_mapping",
            joinColumns = @JoinColumn(name = "policy_id"),
            inverseJoinColumns = @JoinColumn(name = "accomdation_id"))
    private List<Accomodation> accomodations = new ArrayList<Accomodation>();

}
