package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getList1() {
        return new TaskList(new ArrayList<>());}

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getList2() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "doneList")
   // @Scope("prototype")
    public TaskList getList3() {
        return new TaskList(new ArrayList<>());
    }
}
