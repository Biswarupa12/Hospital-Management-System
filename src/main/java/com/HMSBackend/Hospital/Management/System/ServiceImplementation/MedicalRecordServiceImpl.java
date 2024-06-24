package com.HMSBackend.Hospital.Management.System.ServiceImplementation;

import com.HMSBackend.Hospital.Management.System.Entity.Patient;
import com.HMSBackend.Hospital.Management.System.Entity.Prescription;
import com.HMSBackend.Hospital.Management.System.Entity.Visit;
import com.HMSBackend.Hospital.Management.System.Service.MedicalRecordService;

import java.util.List;

public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Override
    public Patient addPatient(Patient patient) {
        return null;
    }

    @Override
    public Visit addVisit(Long patientId, Visit visit) {
        return null;
    }

    @Override
    public Prescription addPrescription(Long visitId, Prescription prescription) {
        return null;
    }

    @Override
    public List<Visit> getVisitsByPatient(Long patientId) {
        return null;
    }

    @Override
    public List<Prescription> getPrescriptionsByVisit(Long visitId) {
        return null;
    }
}
