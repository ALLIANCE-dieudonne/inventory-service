package com.alliance.inventoryservice.services;

import org.springframework.stereotype.Service;

@Service
public interface InventoryService {
  boolean isInStock(String sku_code);
}
