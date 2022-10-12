package com.clothingfly.catalog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class TempItemRepository{
    public List<Item> list= new ArrayList<Item>();
    public TempItemRepository(){   };

    public List<Item> findAll(){
        return this.list;
    }

    public Item save(Item item){
        this.list.add(item);
        return item;
    }

    public Item findById(Long Id){
        for(Item item : this.list) { 
            if(item.getId()==(Id)) { 
                return item;
            }
         }
         return null;
    }
}
