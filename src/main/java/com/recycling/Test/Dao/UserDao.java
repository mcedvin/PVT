package com.recycling.Test.Dao;

import com.recycling.recycling.production.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface UserDao { //TODO: måste extendas någon annanstans
    public Collection<User> getAllUsers();

    public User getUserById(int id);

    public void removeUserById(int id);

    public void updateUser(User updatedUser);

    public void addUser(User newUser);
}
