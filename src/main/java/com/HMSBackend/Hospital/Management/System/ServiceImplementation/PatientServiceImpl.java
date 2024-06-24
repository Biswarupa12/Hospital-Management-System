package com.HMSBackend.Hospital.Management.System.ServiceImplementation;
import com.HMSBackend.Hospital.Management.System.Entity.Patient;
import com.HMSBackend.Hospital.Management.System.Repository.PatientRepo;
import com.HMSBackend.Hospital.Management.System.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService{
@Autowired
private PatientRepo patientRepo;

    @Override
    public Patient createPatient(Patient patient) {
        Patient saveP=patientRepo.save(patient);
        return saveP;
    }

    @Override
    public Optional<Patient> findPatientById(Long patientId) {
        Optional<Patient> databyId=patientRepo.findById(patientId);
        return databyId;
    }

    @Override
    public Patient update(Long patientId, Patient patient) {
        Optional<Patient> patId=findPatientById(patientId);
        patId.setAddress(patient.getAddress());
        patId.setPatientName(patient.getPatientName());
        Patient updatepat = patientRepo.save(patId);
        return updatepat;

    }



    @Override
    public void deleteAllPatient(Patient patient) {

    }

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public Patient deletePatientById(Long patientId) {
        return null;
    }
}
