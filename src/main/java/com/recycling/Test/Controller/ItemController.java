//package com.recycling.Test.Controller;
//
//
//import com.recycling.Test.Service.ItemService;
//import com.recycling.recycling.production.Item;
//import com.recycling.recycling.production.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//@RestController
//@RequestMapping("/items")
//public class ItemController {
//
//    @Autowired
//    private ItemService ItemService;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public Collection<Item> getAllItems() {
//        return ItemService.getAllItems();
//    }
//
//    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void addItem(@RequestBody final Item item) {
//        ItemService.addItem(item);
//    }
//
////    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
////    public void updateUser(@RequestBody User user) {
////        ItemService.updateUser(user);
////    }
////
////    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
////    public void addUser(@RequestBody User user) {
////        userService.addUser(user);
////    }
//}
