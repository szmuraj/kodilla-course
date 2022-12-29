package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Repository;

@Repository
public final class Board {

    public TaskList toDoList;

    public TaskList inProgressList;

    public TaskList doneList;
}
