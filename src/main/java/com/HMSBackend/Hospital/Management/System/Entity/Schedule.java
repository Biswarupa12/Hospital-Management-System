package com.HMSBackend.Hospital.Management.System.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<String> availableSlots;
    private void initializeAvailableSlots() {
        // Simulate generating available slots for the given time range
        // In a real scenario, this might involve more sophisticated logic
        LocalDateTime tempTime = startTime;
        while (tempTime.isBefore(endTime)) {
            availableSlots.add(tempTime.toString()); // Example: add available time slot
            tempTime = tempTime.plusHours(1); // Increment by 1 hour
        }
    }
}

