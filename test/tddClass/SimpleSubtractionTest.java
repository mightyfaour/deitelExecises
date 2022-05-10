package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleSubtractionTest {
    private int multiplicationResult;

    @Test
    public  void  FourMinusOneEqualsThreeTest(){
        SimpleCalculation mathematics = new SimpleCalculation();
        int result = mathematics.subtraction(4 , 1);
        assertEquals(3, result);
    }

    @Test
    public void SixMinusThreeEqualsThreeTest(){
        SimpleCalculation mathematics = new SimpleCalculation();
        int result = mathematics.subtraction(6, 3);
        assertEquals(3, result);
    }
    @Test
    public void SubtractAnyTwoNumber(){
        SimpleCalculation mathematics = new SimpleCalculation();
        int result = mathematics.subtraction(12, 4);
        assertEquals(8, result);
    }
    @Test
    public void SubtractAnyThreeNumber(){
        SimpleCalculation mathematics = new SimpleCalculation();
        int result = mathematics.subtraction(12, 3, 4);
        assertEquals(5, result);
    }
    @Test
    public void SimpleMultiplicationTest(){
        SimpleCalculation simple = new SimpleCalculation();
        simple.multiplicationResult = simple.multiplication(2, 1);
        assertEquals(2,simple.multiplicationResult);
    }
//    @Test
//    public void simpleMultiplicationOfThreeNumbers(){
//        SimpleMultiplication simple = new SimpleMultiplication();
//        simple.multiplicationResult = simple.multiplication(2,3,4);
//        assertEquals();
   // }
}
