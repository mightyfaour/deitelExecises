package tddClass;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata kalculator = new Kata();
        int result = kalculator.add(3,5,6);
        assertEquals(14, result);
    }
    @Test
    public void absolutSubtractTest(){
        Kata Kalculator = new Kata();
        int result = Kalculator.sub(3, 6);
        assertEquals(3, result);
    }
    @Test
    public void divisionTest() {
        Kata Kalculator = new Kata();
        int result = Kalculator.division(6, 3);
        assertEquals(2, result);
    }
    @Test
    public void multiplicationTest() {
        Kata Kalculator = new Kata();
        int result = Kalculator.multiplication(2, 3);
        assertEquals(6, result);
    }
    @Test
    public void areaOfCircleTest() {
        Kata circle = new Kata();
        int result = circle.areaOfCircle(7);
        assertEquals(154, result );
    }
    @Test
    public void bitFlipperTest() {
        Kata flipper = new Kata();
        int result = flipper.flip(5);
        assertEquals(5, result);
    }
    @Test
    public void PalindromeTest() {
        Kata godds = new Kata();
        boolean result = godds.palindrome(23432);
        assertEquals(true, result);
    }

    @Test
    public void testOfEvenNumber(){
        Kata godds = new Kata();
        boolean result = godds.isEvenNumber(3);
        assertEquals(false, result);
    }
    
    @Test
    public void testToCheckTheBiggestNumber() {
        Kata godds = new Kata();
         godds.biggestNumber(5,8,9,15,9);
         assertEquals(99, godds.biggestNumber(55,78,9,15,99));
    }

    @Test
    public void testToReturnAmountOfDatatype (){
        Kata godds = new Kata();
        int result = godds.Ddatatype(49);
        assertEquals(3, result);

    }

    @Test
    public void testForPrimeNumbers() {
        Kata godds = new Kata();
        boolean result = godds.PrimeNumber(89);
        assertEquals(true, result);
    }

}
