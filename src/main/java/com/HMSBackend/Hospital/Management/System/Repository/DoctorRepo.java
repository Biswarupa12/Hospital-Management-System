package com.HMSBackend.Hospital.Management.System.Repository;

import com.HMSBackend.Hospital.Management.System.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
}
