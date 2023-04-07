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
    @OneToMany(mappedBy = "policy")
    private List<Accomdation_policy_mapping> policyMappings = new ArrayList<>();

}
