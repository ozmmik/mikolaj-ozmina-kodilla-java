package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum (){
        theForumUserList.add(new ForumUser(001, "User1", 'F', 1985, 5, 18, 383));
        theForumUserList.add(new ForumUser(002, "User2", 'M', 1954, 8, 1, 302));
        theForumUserList.add(new ForumUser(003, "User3", 'M', 1992, 2, 8, 10));
        theForumUserList.add(new ForumUser(004, "User4", 'F', 1985, 12, 20, 132));
        theForumUserList.add(new ForumUser(005, "User5", 'F', 2003, 2, 26, 43));
        theForumUserList.add(new ForumUser(006, "User6", 'M', 1975, 9, 10, 3));


    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUserList);
    }
}
