package com.example.yanolja.domain.accomodation;


import jakarta.persistence.*;

@Entity
@Table(name = "accomdation")
public class Accomodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String choice;
    @Column(nullable = false)
    private String phoneNumber;

    private String announcement;
    private String policy;
    private long latitude;
    private long longitude;
    @Column(nullable = false)
    private int totalRoom;



    public Accomodation() {
    }


}
