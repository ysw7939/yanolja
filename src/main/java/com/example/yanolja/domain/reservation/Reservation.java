package com.example.yanolja.domain.reservation;

import com.example.yanolja.domain.room.Room;
import com.example.yanolja.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;
    @Column(nullable = false)
    private String reservationName;
    @Column(nullable = false)
    private String reservationPhone;
    @Column(nullable = false)
    private String visitingMeans;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private Date reservationDate;

    @Column
    private Date checkIn;

    @Column
    private Date checkOut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    // 연관관계 메서드
    public void setUser(User user) {
        this.user = user;
        user.getReservations();
    }

    public void setRoom(Room room) {
        this.room = room;
        room.getReservations();
    }

    // 생성 메서드
    public static Reservation createReservation(User user, Room room, String name, String phone,
                                                String means, int price, Date checkIn, Date checkOut) {
        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setRoom(room);
        reservation.setReservationName(name);
        reservation.setReservationPhone(phone);
        reservation.setVisitingMeans(means);
        reservation.setPrice(price);
        reservation.setCheckIn(checkIn);
        reservation.setCheckOut(checkOut);
        return reservation;
    }

}
