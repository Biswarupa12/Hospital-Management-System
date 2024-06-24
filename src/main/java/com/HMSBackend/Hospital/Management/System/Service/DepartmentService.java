package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department createDepartment(Department department);
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    void deleteDepartment(Long Id);
}

