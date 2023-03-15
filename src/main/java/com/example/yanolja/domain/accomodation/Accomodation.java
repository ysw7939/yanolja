package com.example.yanolja.domain.accomodation;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Accomodation {
    private long id;
    private String name;
    private String location;
    private String theme;
    private String accomdationOfType;
    private int phoneNumber;
    private String announcement;
    private String policy;
    private String languageSupport;
    private String sellerInformation;
    private long latitude;
    private long longitude;

    private String photo;

    public Accomodation() {
    }

    public Accomodation(String name, String location, String theme, String accomdationOfType, int phoneNumber, String announcement, String policy, String languageSupport, String sellerInformation, String photo) {
        this.name = name;
        this.location = location;
        this.theme = theme;
        this.accomdationOfType = accomdationOfType;
        this.phoneNumber = phoneNumber;
        this.announcement = announcement;
        this.policy = policy;
        this.languageSupport = languageSupport;
        this.sellerInformation = sellerInformation;
        this.photo = photo;
    }
}
