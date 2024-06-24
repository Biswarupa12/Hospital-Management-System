package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.Inventory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InventoryService {
    Inventory createItem(Inventory inventory);
    Inventory updateItem(Long itemId);
    List<Inventory>getAllItem();
    Inventory getItemById(Long itemId);
    void removeItem(Long itemId);
}
