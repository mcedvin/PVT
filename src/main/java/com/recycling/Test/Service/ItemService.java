package com.recycling.Test.Service;

import com.recycling.Test.Dao.ItemDao;
import com.recycling.recycling.production.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ItemService {

    @Autowired
    private ItemDao ItemDao;

    public Collection<Item> getAllItems() {
        return ItemDao.getAllItems();
    }
}
