package com.recycling.recycling.production;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER")
public class User implements Serializable {
    @GeneratedValue
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Id
    @Column(name = "Email")
    private String email;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account")
    private UserAccount userAccount;

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
