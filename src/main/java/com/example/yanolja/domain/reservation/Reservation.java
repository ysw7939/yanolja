package com.example.yanolja.domain.reservation;

import com.example.yanolja.domain.room.Room;
import com.example.yanolja.domain.user.User;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;
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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
