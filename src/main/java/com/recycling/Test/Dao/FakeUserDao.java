//package com.recycling.Test.Dao;
//
//import com.recycling.DB.repository.UsersRepository;
////import com.recycling.Test.Repository.UserRepository;
//import com.recycling.recycling.production.User;
//import com.recycling.recycling.production.UserAccount;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//    @Qualifier("fake")
//public class FakeUserDao {
////    @Autowired
////    UsersRepository usersRepository;
//
//
//    private static Map<Integer, User> users;
//
//    static {
//        users = new HashMap<Integer, User>() {
//            {
//                put(999, new User(1, "Anders", "Andersson", "andersa@hotmail.com"/*, new UserAccount(999, "password")*/));
//                put(1337, new User(2, "Måns", "Håkansson", "Monka12@hotmail.com"/*, new UserAccount(1337, "lösenord123")*/));
//                put(112911, new User(3, "Stina", "Josefsson", "tina19@hotmail.com"/*, new UserAccount(112911, "iasufdhöaosdncölsamc")*/));
//
//            }
//        };
//    }
//
//
//
//    public Collection<User> getAllUsers() {
////        return usersRepository.findAll();
//        return users.values();
//    }
//    public User getUserById(int id){
//        return users.get(id);
//    }
//    public void removeUserById(int id){
//        users.remove(id);
//    }
//    public void updateUser(User updatedUser){
////        User user = users.get(updatedUser.getUserAccount().getId());
////        user.setEmail(updatedUser.getEmail());
////        users.put(updatedUser.getUserAccount().getId(), updatedUser);
//    }
//    public void addUser(User newUser){
////        users.put(newUser.getUserAccount().getId(), newUser);
//    }
//}
