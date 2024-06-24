package com.HMSBackend.Hospital.Management.System.Entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Patient_details")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long patientId;
    private String patientName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String Symtomps;

}
