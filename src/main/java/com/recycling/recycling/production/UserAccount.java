package com.recycling.recycling.production;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UserAccount")
public class UserAccount implements Serializable {
    @GeneratedValue
    @Column(name = "Id")
    @Id
    private int id;
    @Column(name = "Password")
    private String password; //TODO: måste krypteras på något sätt

    public UserAccount(){

    }

    public UserAccount(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

}
