package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {
    @Test
    public void testThatNumberCanBeSet(){
        Comparison comparison = new Comparison();
        comparison.setNumber(12);
        assertEquals(12, comparison.getNumber());
    }

    @Test
    public void testThatIntegersCanBeComparedToReturnLessThan(){
        Comparison comparison = new Comparison();
        comparison.setNumber(12);
        String message = comparison.compareIntegers(comparison.getNumber(), 100);
        assertEquals("less than", message);
    }

    @Test
    public void testThatIntegersCanBeComparedToReturnGreaterThan() {
        Comparison comparison = new Comparison();
        comparison.setNumber(101);
        String message = comparison.compareIntegers(comparison.getNumber(), 100);
        assertEquals("greater than", message);

    }

    @Test
    public void testThatIntegersCanBeComparedToReturnEqualTo() {
        Comparison comparison = new Comparison();
        comparison.setNumber(100);
        String message = comparison.compareIntegers(comparison.getNumber(), 100);
        assertEquals("equal to", message);
    }
}