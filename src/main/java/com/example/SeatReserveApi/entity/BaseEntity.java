package com.example.SeatReserveApi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@MappedSuperclass
public abstract class BaseEntity{
    @ManyToOne
    @JoinColumn(name="owner_id", nullable = false)
    private User owner;

    @ManyToOne
    @JoinColumn(name="modifier_id",nullable = false)
    private User modifier;

    private LocalDateTime created_at;
    private  LocalDateTime updated_at;
}
