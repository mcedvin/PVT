package com.recycling.Test.Controller;


import com.recycling.Test.Service.UserAccountService;
import com.recycling.recycling.production.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

//@Controller
@RestController
@RequestMapping("/useraccounts")
public class UserAccountController {

    @Autowired
    private UserAccountService UserAccountService;

    //        @GetMapping(value = "/all")
    @RequestMapping(method = RequestMethod.GET)
    public Collection<UserAccount> getAllUserAccounts() {
        return UserAccountService.getAllUserAccounts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserAccount getUserAccountById(@PathVariable("id") int id) {
        return UserAccountService.getUserAccountById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserAccountById(@PathVariable("id") int id) {
        UserAccountService.removeUserAccountById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUserAccount(@RequestBody UserAccount UserAccount) {
        UserAccountService.updateUserAccount(UserAccount);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUserAccount(@RequestBody UserAccount UserAccount) {
        UserAccountService.addUserAccount(UserAccount);
    }
}
