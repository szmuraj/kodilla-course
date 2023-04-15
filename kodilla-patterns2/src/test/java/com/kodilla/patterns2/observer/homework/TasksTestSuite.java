package com.kodilla.patterns2.observer.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksTestSuite {
    @Test
    public void testUpdate() {

        // Given
        Topic javaTopic = new Java();
        Topic pythonTopic = new Python();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");
        javaTopic.registerObserver(johnSmith);
        pythonTopic.registerObserver(ivoneEscobar);
        javaTopic.registerObserver(jessiePinkman);
        pythonTopic.registerObserver(jessiePinkman);

        // When
        javaTopic.addTask("Hi everyoe! Could you help me with for loop?");
        javaTopic.addTask("Better try to use while loop in this case.");
        pythonTopic.addTask("Help pls, my MySQL db doesn't want to work :(");
        javaTopic.addTask("Why while? Is it better?");
        pythonTopic.addTask("When I try to log in I got 'bad credentials' message");

        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
