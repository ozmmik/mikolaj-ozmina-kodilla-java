package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate yearOfBirth;
    private final int postNumber;


    public ForumUser(int userID, String userName, char sex, int yeatOfBirth, int monthOfBirth, int dayOfBirth, int postNumber) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.yearOfBirth = LocalDate.of(yeatOfBirth, monthOfBirth, dayOfBirth);
        this.postNumber = postNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getYearOfBirth() {
        return 2019 - yearOfBirth.getYear();
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", yearOfBirth=" + yearOfBirth +
                ", postNumber=" + postNumber +
                '}';
    }
}
