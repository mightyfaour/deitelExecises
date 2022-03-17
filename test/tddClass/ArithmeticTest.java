package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    @Test

    public void arithmetics(){
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.product(10,20,20);
        assertEquals(4000,result );
    }
}
