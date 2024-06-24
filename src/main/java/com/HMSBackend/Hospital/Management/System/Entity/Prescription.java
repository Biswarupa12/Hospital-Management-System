package com.HMSBackend.Hospital.Management.System.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Prescription_Details")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Visit visit;

    private String medicineName;
    private String dosage;
    private String instructions;


}
