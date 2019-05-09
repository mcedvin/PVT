//package com.recycling.Test.Controller;
//
//
//import com.recycling.Test.Service.PositionService;
//import com.recycling.recycling.production.Position;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Collection;
//import java.util.List;
//
////@Controller
//@RestController
//@RequestMapping("/positions")
//public class PositionController {
//
//    @Autowired
//    private PositionService PositionService;
//
//    //        @GetMapping(value = "/all")
//    @RequestMapping(method = RequestMethod.GET)
//    public Collection<Position> getAllPositions() {
//        return PositionService.getAllPositions();
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Position getPositionById(@PathVariable("id") int id) {
//        return PositionService.getPositionById(id);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deletePositionById(@PathVariable("id") int id) {
//        PositionService.removePositionById(id);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void updatePosition(@RequestBody Position Position) {
//        PositionService.updatePosition(Position);
//    }
//
//////        @PostMapping(value = "/load")
////    public void addPosition(@RequestBody Position Position) {
////        PositionService.addPosition(Position);
////    }
//
//    //    @PostMapping(value = "/load")
//    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void addPosition(@RequestBody final Position Position) {
//        PositionService.addPosition(Position);
//    }
//}
