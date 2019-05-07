package com.recycling.Test.Dao;

import com.recycling.recycling.production.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface UserAccountDao { //TODO: måste extendas någon annanstans
    public Collection<UserAccount> getAllUserAccounts();

    public UserAccount getUserAccountById(int id);

    public void removeUserAccountById(int id);

    public void updateUserAccount(UserAccount updatedUserAccount);

    public void addUserAccount(UserAccount newUserAccount);
}
