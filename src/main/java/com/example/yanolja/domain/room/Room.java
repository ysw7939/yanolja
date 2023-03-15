package com.example.yanolja.domain.room;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class Room {
    private long id;
    public long accomoId;
    public String BasicInformation;
    public String reservationNotice;
    public String theme;
    public Date fewHoursk;
    public Date checkIn;
    public Date checkOut;

    public Room() {
    }

    public Room(long accomoId, String basicInformation, String reservationNotice, String theme, Date fewHoursk, Date checkIn, Date checkOut) {
        this.accomoId = accomoId;
        BasicInformation = basicInformation;
        this.reservationNotice = reservationNotice;
        this.theme = theme;
        this.fewHoursk = fewHoursk;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}
