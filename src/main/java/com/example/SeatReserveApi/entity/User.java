package com.example.SeatReserveApi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String email;
    private String userName;
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}