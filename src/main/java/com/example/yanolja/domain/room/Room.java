package com.example.yanolja.domain.room;

import com.example.yanolja.domain.accomodation.Accomodation;
import com.example.yanolja.domain.reservation.Reservation;
import com.example.yanolja.domain.room.Photo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;
    @Column
    private String basicInformation;
    @Column
    private String reservationNoice;
    @Column(nullable = false)
    private Date checkIn;
    @Column(nullable = false)
    private Date checkOut;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int personnel;
    @Column(nullable = false)
    private int maxPersonnel;
    @Column
    private int rentHours;
    @Column
    private int rentPrice;
    @Column
    private Date operatingStart;
    @Column
    private Date OperatingEnd;

    @OneToMany(mappedBy = "room")
    private List<Photo> photos;
    public void addPhoto(Photo photo) {
        this.photos.add(photo);
        if(photo.getRoom() != this){
            photo.setRoom(this);
        }
    }

    @ManyToMany(mappedBy = "room")
    private List<Theme> theme = new ArrayList<Theme>();

    @ManyToOne
    @JoinColumn(name = "accomdation_id")
    private Accomodation accomodation;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservationList = new ArrayList<Reservation>();
}
