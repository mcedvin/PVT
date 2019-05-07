package com.recycling.Test.Service;

import com.recycling.Test.Dao.ItemSQLDao;
import com.recycling.recycling.production.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ItemService {

    @Autowired
//    @Qualifier("MySQL")
    private ItemSQLDao itemDao;

    public Collection<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    public void addItem(Item item){
        itemDao.addItem(item);
    }
}
