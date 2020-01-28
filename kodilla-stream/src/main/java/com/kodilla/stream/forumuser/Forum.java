package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(007, "JamesB", 'M', 1986, 03,
                18, 8));
        forumUserList.add(new ForumUser(104, "Janusz",'M', 1980, 04,
                01, 25 ));
        forumUserList.add(new ForumUser(146, "Ananas", 'F',1990, 12,
                31, 45));
        forumUserList.add(new ForumUser(452, "Frania", 'F', 1985, 01,
                01, 12));
        forumUserList.add(new ForumUser(325, "Adam01", 'M', 1995, 05,
                01, 58));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
