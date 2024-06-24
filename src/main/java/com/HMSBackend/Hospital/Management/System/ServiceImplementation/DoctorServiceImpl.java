package com.HMSBackend.Hospital.Management.System.ServiceImplementation;

import com.HMSBackend.Hospital.Management.System.Entity.Doctor;
import com.HMSBackend.Hospital.Management.System.Entity.Schedule;
import com.HMSBackend.Hospital.Management.System.Service.DoctorService;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {

    @Override
    public Doctor createDoctor(Doctor doctor) {


        return null;
    }
    @Override
    public Doctor findDoctorById(Long Id) {

        return null;
    }
    @Override
    public Doctor updateDoctorById(Long Id) {

        return null;
    }
    @Override
    public Doctor addSchedule(Long doctorId, Schedule schedule) {

        return null;
    }
    @Override
    public List<Doctor> getAllDoctors() {
        return null;
    }
}
