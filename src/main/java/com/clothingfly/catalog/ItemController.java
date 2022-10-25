package com.clothingfly.catalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {

    private final ItemServiceImpl itemService;
    public ItemController(ItemServiceImpl itemService){
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getItemList();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable Long id){
        return itemService.getItembyId(id);
    }

    @PostMapping("/items/{id}/{quantity}")
    public void updateItemInventory(@PathVariable Long id, @PathVariable Long quantity){
        itemService.updateItemInventory(id, quantity);
    }




}
