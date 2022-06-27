package assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @BeforeEach
    void setUp() {

    }

    //IMPORTANT:
    //given
    //when
    //assert


    @Test
    void testThatCircleHasARadius(){
        //gien that there is a circle
        Circle circle = new Circle(5);
        //when
        int radius = circle.getRadius();

        assertNotEquals(0, radius);
        assertEquals(5, radius);

    }

    @Test
    void testCalculatePerimeter(){
        //given
        Circle circle = new Circle(5);

        //when
        circle.calculatePerimeter();
        double perimeter =  circle.getPerimeter();
        assertEquals(31.42, perimeter);

    }
    @Test
    void testCalculateArea(){
        //given
        Circle circle = new Circle(5);

        //when
        circle.calculateArea();
        double area = circle.getArea();
        assertEquals(78.54, area);

    }

}