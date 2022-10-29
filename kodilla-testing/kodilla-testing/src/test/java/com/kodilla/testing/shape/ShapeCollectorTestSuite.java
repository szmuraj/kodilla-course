package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;

import org.junit.jupiter.api.*;

import java.util.List;

public class ShapeCollectorTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: BEGIN");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: END");
    }

    @Nested
    @DisplayName("Tests for circle")
    class TestCircle {
        @DisplayName("when created circle, " +
                "then getFigure should return circle")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape circle = new Circle();
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), circle);

        }

        @DisplayName("when removed circle, " +
                "then removeFigure should return false"
        )
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape circle = new Circle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), circle);

        }

        @DisplayName("when get circle, " +
                "then getFigure should return 2"
        )
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape circle = new Circle();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);

            shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(2), circle);

        }

        @DisplayName("when showFigures, " +
                "then getFigure should show all figures"
        )
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape circle = new Circle();

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(shapeCollector.showFigures(), circle);

        }
    }
    @Nested
    @DisplayName("Tests for Square")
    class TestSquare {
        @DisplayName("when created square, " +
                "then getFigure should return square")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape square = new Square();
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), square);

        }

        @DisplayName("when removed square, " +
                "then removeFigure should return false"
        )
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape square = new Square();
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), square);

        }

        @DisplayName("when get square, " +
                "then getFigure should return 2"
        )
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape square = new Square();

            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);

            shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(2), square);

        }

        @DisplayName("when showFigures, " +
                "then getFigure should show all figures"
        )
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape square = new Square();

            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(shapeCollector.showFigures(), square);

        }
    }
    @Nested
    @DisplayName("Tests for triangle")
    class TestTriangle {
        @DisplayName("when created triangle, " +
                "then getFigure should return triangle")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape triangle = new Triangle();
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), triangle);

        }

        @DisplayName("when removed triangle, " +
                "then removeFigure should return false"
        )
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape triangle = new Triangle();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle);
            shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), triangle);

        }

        @DisplayName("when get triangle, " +
                "then getFigure should return 2"
        )
        @Test
        void testGetFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape triangle = new Triangle();

            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle);

            shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(shapeCollector.getFigure(2), triangle);

        }

        @DisplayName("when showFigures, " +
                "then getFigure should show all figures"
        )
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape triangle = new Triangle();

            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(shapeCollector.showFigures(), triangle);
        }
    }
}
