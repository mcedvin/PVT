package com.recycling.Test.Dao;

import com.recycling.recycling.production.User;
import com.recycling.recycling.production.UserAccount;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    private static Map<Integer, User> users;

    static {
        users = new HashMap<Integer, User>() {
            {
                put(999, new User("Anders", "Andersson", "andersa@hotmail.com", new UserAccount(999, "password")));
                put(1337, new User("Måns", "Håkansson", "Monka12@hotmail.com", new UserAccount(1337, "lösenord123")));
                put(112911, new User("Stina", "Josefsson", "Stina19@hotmail.com", new UserAccount(112911, "iasufdhöaosdncölsamc")));

            }
        };
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }
    public User getUserById(int id){
        return users.get(id);
    }
    public void removeUserById(int id){
        users.remove(id);
    }
    public void updateUser(User updatedUser){
//        User user = users.get(updatedUser.getUserAccount().getId());
//        user.setEmail(updatedUser.getEmail());
        users.put(updatedUser.getUserAccount().getId(), updatedUser);
    }
    public void addUser(User newUser){
        users.put(newUser.getUserAccount().getId(), newUser);
    }
}
