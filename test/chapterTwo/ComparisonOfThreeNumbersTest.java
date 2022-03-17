package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonOfThreeNumbersTest {
    @Test
    public void testThatTheNumberCanBeSet() {
        Comparison comparison = new Comparison();
        comparison.setNumber(12);
        assertEquals(12,comparison.getNumber());
    }

}
//
//    public void testThatNumberCanBeSet(){
//        Comparison comparison = new Comparison();
//        comparison.setNumber(12);
//        assertEquals(12, comparison.getNumber());
//    }