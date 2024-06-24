package com.HMSBackend.Hospital.Management.System.Repository;

import com.HMSBackend.Hospital.Management.System.Entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FacilityRepo extends JpaRepository<Facility,Long> {
}
