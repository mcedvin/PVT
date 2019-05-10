package com.recycling.Test.Controller;


import com.recycling.Test.Service.MaterialService;
import com.recycling.recycling.production.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

//@Controller
@RestController
@RequestMapping("/materials")
public class MaterialController {

    @Autowired
    private MaterialService MaterialService;

    //        @GetMapping(value = "/all")
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Material> getAllMaterials() {
        return MaterialService.getAllMaterials();
    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Material getMaterialById(@PathVariable("id") int id) {
//        return MaterialService.getMaterialById(id);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteMaterialById(@PathVariable("id") int id) {
//        MaterialService.removeMaterialById(id);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void updateMaterial(@RequestBody Material Material) {
//        MaterialService.updateMaterial(Material);
//    }

////        @PostMapping(value = "/load")
//    public void addMaterial(@RequestBody Material Material) {
//        MaterialService.addMaterial(Material);
//    }

    //    @PostMapping(value = "/load")
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addMaterial(@RequestBody final Material Material) {
        MaterialService.addMaterial(Material);
    }
}
