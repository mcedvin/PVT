package com.recycling.DB.repository;
import com.recycling.recycling.production.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
}

