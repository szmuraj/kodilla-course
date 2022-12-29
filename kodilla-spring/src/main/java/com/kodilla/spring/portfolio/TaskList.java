package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private List<String> tasks;

    public TaskList(List<String> tasks1) {
        tasks = tasks1;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
