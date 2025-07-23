package com.example.booking_system.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @NotNull
    private UUID id;

    @NotNull
    private User user;

    @NotNull
    private TimeSlot timeSlot;

    @NotNull
    private BookingStatus status;

    public enum BookingStatus {
        CONFIRMED,
        CANCELLED
    }
}
