package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Billing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillingService {
    Billing createBilling(Billing billing);

    Billing updateBilling(Long Id);

    List<Billing> getAllBilling();

    Billing getBillingById(Long Id);
    void deleteBilling(Long Id);
}
