package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PatientService {
Patient createPatient(Patient patient);
    Optional<Patient> findPatientById(Long patientId);
    Patient update(Long patientId);
 void deleteAllPatient(Patient patient);
List<Patient> getAllPatients();
    Patient deletePatientById(Long patientId);
}



