package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Topic topic) {
        System.out.println(username + ": New task in topic " + topic.getName() + "\n" +
                " (total: " + topic.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
