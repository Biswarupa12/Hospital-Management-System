package com.HMSBackend.Hospital.Management.System.ServiceImplementation;

import com.HMSBackend.Hospital.Management.System.Entity.Appointment;
import com.HMSBackend.Hospital.Management.System.Service.AppointmentService;

import java.time.LocalDateTime;
import java.util.List;

public class AppointmentServiceImpl implements AppointmentService {
    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return null;
    }

    @Override
    public List<Appointment> getAppointmentsByDateTime(LocalDateTime dateTime) {
        return null;
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return null;
    }

    @Override
    public void deleteAppointment(Long id) {

    }
}
