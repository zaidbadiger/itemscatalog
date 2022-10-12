package com.clothingfly.catalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{
    
    private final TempItemRepository itemRepository;

    public ItemServiceImpl(TempItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }


    @Override
    public List<Item> getItemList(){
        return (List<Item>) itemRepository.findAll();
    }

    @Override
    public Item getItembyId(Long Id){
        return itemRepository.findById(Id);
        // if(item.isPresent()){
        //     return item.get();
        // }
        // else{
        //     return null;
        // }
        //return null;
    }

    @Override
    public Long getQuantitybyId(Long Id){
        // var item = itemRepository.findById(Id);
        // if(item.isPresent()){
        //     return item.get().getQuantity();
        // }
        // else{
        //     long value = 0;
        //     return value;
        // }
        return null;
    }

    @Override
    public Item save(Item item){
        return itemRepository.save(item);
    }
}
