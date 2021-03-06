package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.Year;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        int currentYear = Year.now().getValue();

        theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> currentYear - forumUser.getYearOfBirth() >= 20)
                .filter(forumUser -> forumUser.getPostNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser))
                .entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        /*System.out.println("MapList elements no.: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/
    }
}