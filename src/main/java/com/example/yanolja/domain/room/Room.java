package com.example.yanolja.domain.room;

import com.example.yanolja.domain.accomodation.Accomodation;
import com.example.yanolja.domain.reservation.Reservation;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private List<RoomPhoto> roomPhotos;

    public void addPhoto(RoomPhoto roomPhoto) {
        this.roomPhotos.add(roomPhoto);
        if(roomPhoto.getRoom() != this){
            roomPhoto.setRoom(this);
        }
    }

    @OneToMany(mappedBy = "room")
    private List<Room_theme_mapping> themeMappings = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accomodation_id")
    private Accomodation accomodation;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations = new ArrayList<Reservation>();
}
