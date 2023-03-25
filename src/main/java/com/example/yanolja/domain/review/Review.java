package com.example.yanolja.domain.review;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private int starRating;
    @Column(nullable = false)
    private Date dateCreated;
    @Column(nullable = false)
    private String content;
    @Column
    private String answer;
    @Column
    private Date answerDate;



}
