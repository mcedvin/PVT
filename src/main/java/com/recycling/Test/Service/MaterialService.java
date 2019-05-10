package com.recycling.Test.Service;

import com.recycling.Test.Dao.MaterialSQLDao;
import com.recycling.recycling.production.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MaterialService {

    @Autowired
//    @Qualifier("MySQL")
    private MaterialSQLDao MaterialDao;

    public Collection<Material> getAllMaterials() {
        return MaterialDao.getAllmaterials();
    }

    public void addMaterial(Material Material){
        MaterialDao.addmaterial(Material);
    }
}
