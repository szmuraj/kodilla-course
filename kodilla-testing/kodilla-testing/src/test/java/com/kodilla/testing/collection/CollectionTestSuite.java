package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("WHEN create empty List, " +
            "THEN ")
    @Test
    void testOddNumbersExterminatorEmptyList() {

    @DisplayName("WHEN odd and even numbers are in the List, " +
            "THEN ")
    @Test
    void testOddNumbersExterminatorNormalList() {

    }
}
