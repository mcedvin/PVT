package com.recycling.Test.Service;

import com.recycling.Test.Dao.UserDao;
import com.recycling.recycling.production.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserDao UserDao;

    public Collection<User> getAllUsers() {
        return UserDao.getAllUsers();
    }
}
