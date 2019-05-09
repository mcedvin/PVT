package com.recycling.recycling.production;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Column(name = "FirstName", length = 100)
    private String firstName;
    @Column(name = "LastName", length = 100)
    private String lastName;
    //    @GeneratedValue
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")

    @Column(name = "email", length = 100)
    @Id
    private String email;
    @OneToOne(optional = true)
    @JoinColumn(nullable = true, name = "UserAccount")
    private UserAccount userAccount; //TODO: dessa ska fixas

    public User() {

    }

    public User(String firstName, String lastName, String email, UserAccount userAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userAccount = userAccount;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
