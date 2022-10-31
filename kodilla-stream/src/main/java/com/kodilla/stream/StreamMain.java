package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

        Forum theForum = new Forum();
        String  theResultStringOfForum = theForum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.getUserBirthDate().getYear() < 2002)
                .filter(user -> user.getPostsCount() >= 1)
                .map(user -> user.getUserIndex() + " : " + user.getUserName()).toString();

        System.out.println(theResultStringOfForum);
    }
}