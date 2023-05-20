package com.example.yanolja.domain.accomodation;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;

@Embeddable
@Getter
public class Adress {
    private String location;
    private long latitude;
    private long longitude;

    public Adress(String location, long latitude, long longitude) {
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Adress() {

    }
}
