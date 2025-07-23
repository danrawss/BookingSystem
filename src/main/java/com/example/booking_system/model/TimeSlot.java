package com.example.booking_system.model;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlot {
    @NotNull
    private LocalDateTime start;

    @NotNull
    private LocalDateTime end;

    @AssertTrue(message = "end time must be after start time")
    public boolean isEndAfterStart() {
        if (start == null || end == null) {
            return false;
        }
        return end.isAfter(start);
    }
}
