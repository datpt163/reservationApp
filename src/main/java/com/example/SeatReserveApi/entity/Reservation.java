package com.example.SeatReserveApi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Reservation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="check_in_at")
    private LocalDateTime checkInAt;

    @Column(name="start_time")
    private LocalDateTime startTime;

    @Column(name="end_time")
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private ReservationStatus status;

    @ManyToOne
    @JoinColumn(name = "extended_from_reservation_id")
    private Reservation extendedFromReservation;

    @OneToMany(mappedBy = "extendedFromReservation")
    private List<Reservation> extendedReservations;
}