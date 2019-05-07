package com.recycling.DB.repository;
import com.recycling.recycling.production.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}

