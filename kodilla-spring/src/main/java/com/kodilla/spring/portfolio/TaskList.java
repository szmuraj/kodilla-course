package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public final class TaskList {

    List<String> tasks;

    public void tasks() {
        tasks = new ArrayList<>();
    }
}
