package com.example.yanolja.domain.review;


import com.example.yanolja.domain.room.Room;
import com.example.yanolja.domain.user.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

    @OneToMany
    @JoinColumn(name = "photo_id")
    private List<Photo> photos;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;


}
