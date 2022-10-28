package shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

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
            Assertions.assertEquals(shapeCollector.getFigure(1), circle);

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

            shapeCollector.showFigures(circle);

            //Then
            Assertions.assertEquals(ShapeCollector.List.size, circle);

        }
    }
}
