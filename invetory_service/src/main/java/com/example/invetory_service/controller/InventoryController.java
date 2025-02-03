package com.example.invetory_service.controller;

import com.example.invetory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInStock(@PathVariable("sku-code") String skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
