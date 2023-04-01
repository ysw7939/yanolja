package com.example.yanolja.domain.accomodation;


import com.example.yanolja.domain.room.Room;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "accomodation")
public class Accomodation {
    @Id
    @Column(name = "ACCOMDOATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String choice;
    @Column(nullable = false)
    private String phoneNumber;
    private String announcement;
    private long latitude;
    private long longitude;
    @Column(nullable = false)
    private int totalRoom;

    @OneToMany(mappedBy = "accomodation")
    private List<AccomPhoto> accomPhotos = new ArrayList<AccomPhoto>();

    public void addPhoto(AccomPhoto accomPhoto) {
        this.accomPhotos.add(accomPhoto);
        if(accomPhoto.getAccomodation() != this){
            accomPhoto.setAccomodation(this);
        }
    }

    @OneToOne(mappedBy = "accomodation") // 연관관계의 주인이 아님을 뜻함
    private SellerInformation sellerInformation;

    @ManyToMany(mappedBy = "accomodations")
    private List<Policy> policy = new ArrayList<Policy>();
    @ManyToMany(mappedBy = "accomodations")
    private List<Language> language = new ArrayList<Language>();

    @ManyToMany(mappedBy = "accomodations")
    private List<AccomTheme> accomTheme = new ArrayList<AccomTheme>();

    @OneToMany(mappedBy = "accomodation")
    private List<Room> rooms = new ArrayList<Room>();

}
