package com.HMSBackend.Hospital.Management.System.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Visit_Details")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Patient patient;

    private LocalDateTime visitDateTime;
    private String doctor;
    private String diagnosis;
    private String notes;

}
