//package com.recycling.Test.Dao;
//
//import com.recycling.recycling.production.Item;
//import com.recycling.recycling.production.Material;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//@Qualifier("fake")
//public class FakeItemDao implements ItemDao{
//    private static Map<Integer, Item> Items;
//
//    static {
//        Items = new HashMap<Integer, Item>() {
//            {
//                put(1, new Item("Plastflaska", 100, new Material("Plast", 38)));
//                put(2, new Item("Glasflaska", 30, new Material("Glas", 10)));
//                put(3, new Item("Konservburk", 62, new Material("Metall", 25)));
//            }
//        };
//    }
//
//    public Collection<Item> getAllItems() {
//        return Items.values();
//    }
//}
