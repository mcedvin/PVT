package com.recycling.Test.Dao;

import com.recycling.DB.repository.UserAccountsRepository;
import com.recycling.recycling.production.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
@Qualifier("MySQL")
public class UserAccountSQLDao {

    @Autowired
    UserAccountsRepository UserAccountsRepository;

    public Collection<UserAccount> getAllUserAccounts(){
        return UserAccountsRepository.findAll();
//        return null;
    }

    public UserAccount getUserAccountById(int id){
        return null;
    }

    public void removeUserAccountById(int id){

    }

    public void updateUserAccount(UserAccount updatedUserAccount){

    }

    public void addUserAccount(UserAccount newUserAccount){

    }
}
