//package com.recycling.DB.resource;
//
//import com.recycling.DB.repository.UsersRepository;
//import com.recycling.recycling.production.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/rest/USER")
//public class UsersResource {
//
//    @Autowired
//    UsersRepository usersRepository;
//
//    @GetMapping(value = "/all")
//    public List<User> getAll() {
//        return usersRepository.findAll();
//    }
//
//    @PostMapping(value = "/load")
//    public List<User> persist(@RequestBody final User user) {
//        usersRepository.save(user);
//        return usersRepository.findAll();
//    }
//}
