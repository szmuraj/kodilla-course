package com.kodilla.testing.forum.statistics;

import java.util.Collection;
import java.util.List;

public class ForumStatisticks {

    private Statistics statistics;

    public ForumStatisticks(Statistics statistics) {
        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        int usersCount = statistics.usersNames().size();
        double avgCommentsOnUser = statistics.commentsCount()/usersCount;
        double avgPostsOnUser = statistics.postsCount()/usersCount;
        double avgCommentsOnPost = statistics.commentsCount()/statistics.postsCount();
    }

    public List<String> showStatistics() {
        return null;
    }

    public List<String> usersNames() {
        return statistics.usersNames();
    }

    public int postsCount() {
        return statistics.postsCount();
    }

    public int commentsCount() {
        return statistics.commentsCount();
    }
}