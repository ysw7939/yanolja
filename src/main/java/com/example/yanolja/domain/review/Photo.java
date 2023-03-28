package com.example.yanolja.domain.review;

import com.example.yanolja.domain.accomodation.Accomodation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "review_photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoId;
    @Column(nullable = false)
    private String photo;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

    public void setReview(Review review) {
        this.review = review;
        if (!review.getPhotos().contains(this)) {
            review.getPhotos().add(this);
        }
    }

}
