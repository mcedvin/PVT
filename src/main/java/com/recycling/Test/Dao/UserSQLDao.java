package com.recycling.Test.Dao;

import com.recycling.DB.repository.UsersRepository;
import com.recycling.recycling.production.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
@Qualifier("MySQL")
public class UserSQLDao {

    @Autowired
    UsersRepository usersRepository;

    public Collection<User> getAllUsers(){
    return usersRepository.findAll();
//        return null;
    }

    public User getUserById(int id){
    return null;
    }

    public void removeUserById(int id){

    }

    public void updateUser(User updatedUser){

    }

    public void addUser(User newUser){

    }
}
