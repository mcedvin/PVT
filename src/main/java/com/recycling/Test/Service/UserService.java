package com.recycling.Test.Service;

import com.recycling.Test.Dao.UserDao;
import com.recycling.Test.Dao.UserSQLDao;
import com.recycling.recycling.production.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    @Qualifier("MySQL")
    private UserSQLDao userDao;

    public Collection<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    public void removeUserById(int id){
        userDao.removeUserById(id);
    }
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
}
