package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(0001,"szmuraj", 'M', LocalDate.of(1996, 4, 25), 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}
