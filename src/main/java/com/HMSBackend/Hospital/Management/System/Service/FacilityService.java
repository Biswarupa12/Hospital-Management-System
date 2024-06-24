package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Facility;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacilityService {
    Facility addService(Facility facility);
    Facility updateService(Facility facility);
    Facility removeService(Facility facility);
   List <Facility>getAllService();
}
