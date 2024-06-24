package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Appointment;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment getAppointmentById(Long id);

    List<Appointment> getAppointmentsByDateTime(LocalDateTime dateTime);

    Appointment saveAppointment(Appointment appointment);

    void deleteAppointment(Long id);
}
