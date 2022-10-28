package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

    @DisplayName("WHEN create empty List with Integer, " +
            "THEN getOddNumbersList should return null")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        oddNumbersExterminator.exterminate(null);

        //Then
        Assertions.assertEquals((Integer) null,null);
    }
    @DisplayName("WHEN odd and even numbers are in the List, " +
            "THEN List should behave normaly")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);

        oddNumbersExterminator.exterminate(List);

        //Then
        Assertions.assertEquals(List, List);

    }
}
