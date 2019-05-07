package com.recycling.Test.Dao;

import com.recycling.recycling.production.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ItemDao {

    public Collection<Item> getAllItems();
}
