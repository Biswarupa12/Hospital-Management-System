package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Doctor;
import com.HMSBackend.Hospital.Management.System.Entity.Schedule;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {
    Doctor createDoctor(Doctor doctor);

    Doctor findDoctorById(Long Id);

    Doctor updateDoctorById(Long Id);

    Doctor addSchedule(Long doctorId, Schedule schedule);

    List<Doctor> getAllDoctors();

}
