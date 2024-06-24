package com.HMSBackend.Hospital.Management.System.Repository;

import com.HMSBackend.Hospital.Management.System.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
