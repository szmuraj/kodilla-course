package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int userIndex;
    final String userName;
    final char userSex;
    final LocalDate userBirthDate;
    final int postsCount;

    public ForumUser(final int userIndex, final String userName, final char userSex, final LocalDate userBirthDate, final int postsCount) {
        this.userIndex = userIndex;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthDate = userBirthDate;
        this.postsCount = postsCount;
    }

    public int getUserIndex() {
        return userIndex;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }
}
