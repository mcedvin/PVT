package com.recycling.Test.Dao;

import com.recycling.DB.repository.ItemRepository;
import com.recycling.recycling.production.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
//@Qualifier("MySQL")
public class ItemSQLDao implements ItemDao{


    @Autowired
    ItemRepository itemRepository;

    public Collection<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public void addItem(Item item){
        itemRepository.save(item);
    }


}
