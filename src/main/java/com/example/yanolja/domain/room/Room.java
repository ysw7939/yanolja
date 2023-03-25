package com.example.yanolja.domain.room;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;
    @Column
    private String basicInformation;
    @Column
    private String reservationNoice;
    @Column(nullable = false)
    private Date checkIn;
    @Column(nullable = false)
    private Date checkOut;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int personnel;
    @Column(nullable = false)
    private int maxPersonnel;
    @Column
    private int rentHours;
    @Column
    private int rentPrice;
    @Column
    private Date operatingStart;
    @Column
    private Date OperatingEnd;


}
