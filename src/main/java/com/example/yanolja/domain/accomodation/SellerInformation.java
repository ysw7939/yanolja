package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;

@Entity
@Table(name = "seller_information")
public class SellerInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SellerInformationId;
    @Column(nullable = false)
    private String repersentName;
    @Column(nullable = false)
    private String corporateName;
    @Column(nullable = false)
    private String businessAddress;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String businessRegistNum;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOMDOATION_ID")
    private Accomodation accomodation;
}
