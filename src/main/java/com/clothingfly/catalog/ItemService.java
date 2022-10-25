package com.clothingfly.catalog;

import java.util.List;

public interface ItemService {
    //get all items
    List<Item> getItemList();
    //get item by id
    Item getItembyId(Long id);
    //get item quantity by id;
    Long getQuantitybyId(Long id);

    Item save(Item item);

    void updateItemInventory(Long id, Long quantity);
}
