package com.example.yanolja.domain.accomodation;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "accomodation_PHOTO")
public class AccomPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long photo_id;
    @Column(nullable = false)
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOMODATION_ID")
    private Accomodation accomodation;

    public void setAccomodation(Accomodation accomodation) {
        this.accomodation = accomodation;
        if (!accomodation.getAccomPhotos().contains(this)) {
            accomodation.getAccomPhotos().add(this);
        }
    }
}
