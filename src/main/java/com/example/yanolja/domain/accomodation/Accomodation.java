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
@Table(name = "accomdation")
public class Accomodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "accomdation")
    private List<Photo> photos = new ArrayList<Photo>();

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
        if(photo.getAccomodation() != this){
            photo.setAccomodation(this);
        }
    }

    @OneToOne(mappedBy = "accomdation") // 연관관계의 주인이 아님을 뜻함
    private SellerInformation sellerInformation;

    @ManyToMany(mappedBy = "accomdation")
    private List<Policy> policy = new ArrayList<Policy>();
    @ManyToMany(mappedBy = "accomdation")
    private List<Language> language = new ArrayList<Language>();

    @ManyToMany(mappedBy = "accomdation")
    private List<Theme> theme = new ArrayList<Theme>();

    @OneToMany(mappedBy = "accomdation")
    private List<Room> rooms = new ArrayList<Room>();

}
