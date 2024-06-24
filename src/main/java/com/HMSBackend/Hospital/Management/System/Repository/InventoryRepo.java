package com.HMSBackend.Hospital.Management.System.Repository;

import com.HMSBackend.Hospital.Management.System.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory,Long> {
}
