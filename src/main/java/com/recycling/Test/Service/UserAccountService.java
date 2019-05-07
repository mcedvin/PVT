package com.recycling.Test.Service;

import com.recycling.Test.Dao.UserAccountSQLDao;
import com.recycling.recycling.production.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserAccountService {

    @Autowired
//    @Qualifier("MySQL")
    private UserAccountSQLDao userAccountDao;

    public Collection<UserAccount> getAllUserAccounts() {
        return userAccountDao.getAllUserAccounts();
    }
    public UserAccount getUserAccountById(int id){
        return userAccountDao.getUserAccountById(id);
    }
    public void removeUserAccountById(int id){
        userAccountDao.removeUserAccountById(id);
    }
    public void updateUserAccount(UserAccount UserAccount){
        userAccountDao.updateUserAccount(UserAccount);
    }
    public void addUserAccount(UserAccount UserAccount){
        userAccountDao.addUserAccount(UserAccount);
    }
}
