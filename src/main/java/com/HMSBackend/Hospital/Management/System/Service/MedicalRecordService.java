package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Patient;
import com.HMSBackend.Hospital.Management.System.Entity.Prescription;
import com.HMSBackend.Hospital.Management.System.Entity.Visit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MedicalRecordService {
     Patient addPatient(Patient patient);
    Visit addVisit(Long patientId, Visit visit);
     Prescription addPrescription(Long visitId, Prescription prescription);
    List<Visit> getVisitsByPatient(Long patientId);
    List<Prescription> getPrescriptionsByVisit(Long visitId);
}

