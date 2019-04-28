package com.recycling.Test.Controller;


import com.recycling.Test.Service.UserService;
import com.recycling.recycling.production.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> getAllUsers() {
        return UserService.getAllUsers();
    }
}
