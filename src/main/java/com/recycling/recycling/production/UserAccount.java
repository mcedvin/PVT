package com.recycling.recycling.production;

public class UserAccount {

    private int id;
    private String password; //TODO: måste krypteras på något sätt

    public UserAccount(int id, String password){
    this.id = id;
    this.password = password;
    }
    public int getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }

}
