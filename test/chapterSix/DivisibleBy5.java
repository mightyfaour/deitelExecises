package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DivisibleBy5 {
    @Test
    public void TestDivisibleBy5CanBeCreated (){
        Divisible divisibleBy5 = new Divisible ();
        divisibleBy5.setNumber(54);
        assertFalse(divisibleBy5.getNumber());
//        assertEquals(true, divisibleBy5.getNumber());

    }
}
