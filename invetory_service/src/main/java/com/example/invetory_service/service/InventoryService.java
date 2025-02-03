package com.example.invetory_service.service;

import com.example.invetory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String itemName) {
        return  inventoryRepository.findBySkuCode(itemName).isPresent();
    }
}
