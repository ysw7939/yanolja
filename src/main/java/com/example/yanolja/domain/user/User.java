package com.example.yanolja.domain.user;

import com.example.yanolja.domain.reservation.Reservation;
import com.example.yanolja.domain.review.Review;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String nickName;
    @Column(nullable = false)
    private String loginId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String email;

    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Review> reviewList = new ArrayList<Review>();

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<Reservation>();
}
