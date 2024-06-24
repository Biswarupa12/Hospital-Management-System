package com.HMSBackend.Hospital.Management.System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Appointment_Details")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String patientId;
    private String doctorId;

    private LocalDateTime dateTime;
    private String Symtomps;
    private boolean confirmed;

}
