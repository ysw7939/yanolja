package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "accomdation_photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photo_id;
    @Column(nullable = false)
    private String photo;

    @ManyToOne
    @JoinColumn(name = "accomdation_id")
    private Accomodation accomodation;

    public void setAccomodation(Accomodation accomodation) {
        this.accomodation = accomodation;
        if (!accomodation.getPhotos().contains(this)) {
            accomodation.getPhotos().add(this);
        }
    }
}
