package com.recycling.recycling.production;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private UserAccount userAccount;

    public User(String firstName, String lastName, String email, UserAccount userAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userAccount = userAccount;
    }

    public UserAccount getUserAccount() {
        return userAccount;
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
