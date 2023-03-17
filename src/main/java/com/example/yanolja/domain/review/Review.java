package com.example.yanolja.domain.review;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class Review {
    private long id;
    private long accommodationId;
    private long roomId;
    private int starRating;
    private Date date;
    private String content;
    private String photo;

    public Review() {
    }

    public Review(long accommodationId, long roomId, int starRating, Date date, String content, String photo) {
        this.accommodationId = accommodationId;
        this.roomId = roomId;
        this.starRating = starRating;
        this.date = date;
        this.content = content;
        this.photo = photo;
    }
}
