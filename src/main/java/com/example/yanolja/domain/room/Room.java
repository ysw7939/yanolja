package com.example.yanolja.domain.room;

import com.example.yanolja.domain.accomodation.Accomodation;
import com.example.yanolja.domain.reservation.Reservation;
import com.example.yanolja.domain.room.Photo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany
    @JoinColumn(name = "photo_id")
    private List<Photo> photos;

    @ManyToMany
    @JoinTable(name = "room_theme",
    joinColumns = @JoinColumn(name = "room_id"),
    inverseJoinColumns = @JoinColumn(name = "theme_id"))
    private List<Theme> theme = new ArrayList<Theme>();

    @ManyToOne
    @JoinColumn(name = "accomdation_id")
    private Accomodation accomodation;

    @OneToMany
    @JoinColumn(name = "reservaion_id")
    private List<Reservation> reservationList = new ArrayList<Reservation>();
}
