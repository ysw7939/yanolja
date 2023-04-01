package com.example.yanolja.domain.review;


import com.example.yanolja.domain.room.Room;
import com.example.yanolja.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToMany(mappedBy = "review")
    private List<ReviewPhoto> reviewPhotos = new ArrayList<ReviewPhoto>();

    public void addPhoto(ReviewPhoto reviewPhoto) {
        this.reviewPhotos.add(reviewPhoto);
        if(reviewPhoto.getReview() != this){
            reviewPhoto.setReview(this);
        }
    }

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false,updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;


}
