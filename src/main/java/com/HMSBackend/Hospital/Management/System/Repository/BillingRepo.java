package com.HMSBackend.Hospital.Management.System.Repository;

import com.HMSBackend.Hospital.Management.System.Entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepo extends JpaRepository<Billing,Long> {
}
