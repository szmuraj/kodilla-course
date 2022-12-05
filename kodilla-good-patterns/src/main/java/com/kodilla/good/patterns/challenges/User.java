package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private User userID;
    private String userAddress;


    public User(String userName, User userID, String userAddress) {
        this.userName = userName;
        this.userID = userID;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User getUserID() {return userID;}

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
