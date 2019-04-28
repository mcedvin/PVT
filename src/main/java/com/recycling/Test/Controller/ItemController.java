package com.recycling.Test.Controller;


import com.recycling.Test.Service.ItemService;
import com.recycling.recycling.production.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService ItemService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Item> getAllItems() {
        return ItemService.getAllItems();
    }
}
