package assignments;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTestUncleBobTest {
    private Stack stack;
    @BeforeEach
    void setUp() throws Exception {
        stack = new Stack();

    }

    @Test
    void newStack_IsEmpty() throws Exception{
        UncleBobStack stack = new UncleBobStack();
        assertTrue(stack.isEmpty());
    }
    @Test
    void afterOnePush_IsNotEmpty() throws Exception{
        UncleBobStack stack = new UncleBobStack();
        stack.push(0);
        assertFalse(stack.isEmpty());
    }
//    @Test
//    void ()throws Exception
}
