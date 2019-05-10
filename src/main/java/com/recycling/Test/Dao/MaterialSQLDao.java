package com.recycling.Test.Dao;

import com.recycling.DB.repository.MaterialRepository;
import com.recycling.recycling.production.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
//@Qualifier("MySQL")
public class MaterialSQLDao {

    @Autowired
    private MaterialRepository materialRepository;

    public Collection<Material> getAllmaterials(){
        return materialRepository.findAll();
    }

    public Material getmaterialById(int id){
        return null;
    }

    public void removematerialById(int id){
    }

    public void updatematerial(Material updatedmaterial){

    }

    public void addmaterial(Material newmaterial){
        materialRepository.save((newmaterial));
    }
}
