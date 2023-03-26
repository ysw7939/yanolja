package com.example.yanolja.domain.accomodation;


import com.example.yanolja.domain.room.Room;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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

    @OneToMany
    @JoinColumn(name = "photo_id")
    private List<Photo> photos;

    @OneToOne
    @JoinColumn(name = "seller_information_id")
    private SellerInformation sellerInformation;

    @ManyToMany
    @JoinTable(name = "accomdation_policy",
                joinColumns = @JoinColumn(name = "accomdation_id"),
                inverseJoinColumns = @JoinColumn(name = "policy_id"))
    private List<Policy> policy = new ArrayList<Policy>();
    @ManyToMany
    @JoinTable(name = "accomdation_language",
            joinColumns = @JoinColumn(name = "accomdation_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> language = new ArrayList<Language>();

    @ManyToMany
    @JoinTable(name = "accomdation_theme",
            joinColumns = @JoinColumn(name = "accomdation_id"),
            inverseJoinColumns = @JoinColumn(name = "theme_id"))
    private List<Theme> theme = new ArrayList<Theme>();

    @OneToMany
    @JoinColumn(name = "room_id")
    private List<Room> rooms = new ArrayList<Room>();

}
