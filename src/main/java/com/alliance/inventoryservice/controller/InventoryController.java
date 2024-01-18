package com.alliance.inventoryservice.controller;

import com.alliance.inventoryservice.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v4/inventory")
@RequiredArgsConstructor
public class InventoryController {
  @Autowired
  private final InventoryService inventoryService;

  @GetMapping("/{sku-code}")
  @ResponseStatus(HttpStatus.OK)
  public boolean isInStock(@PathVariable("sku-code") String sku_code) {
    return inventoryService.isInStock(sku_code);
  }
}
