package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Shift;
import com.HMSBackend.Hospital.Management.System.Entity.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StaffService  {
    Staff createStaff(Staff staff);


    Staff findStaffById(Long Id);

    Staff updateStaffById(Long Id);

    Staff assignShift(Long staffId, Shift shift);


    List<Staff> getAllStaff();

}

