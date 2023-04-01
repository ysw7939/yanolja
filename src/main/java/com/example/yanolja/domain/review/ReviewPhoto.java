package com.example.yanolja.domain.review;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "review_photo")
public class ReviewPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long photoId;
    @Column(nullable = false)
    private String photo;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

    public void setReview(Review review) {
        this.review = review;
        if (!review.getReviewPhotos().contains(this)) {
            review.getReviewPhotos().add(this);
        }
    }

}
