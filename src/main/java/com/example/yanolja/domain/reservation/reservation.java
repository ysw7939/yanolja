package com.example.yanolja.domain.reservation;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reservation")
public class reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationId;
    @Column(nullable = false)
    private String reservationName;
    @Column(nullable = false)
    private String reservationPhone;
    @Column(nullable = false)
    private String visitingMeans;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private Date reservationDate;
}
