package Charlenge.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest {

    @Test
    public void stackCanBeCreated(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }

    @Test
    public void stackCanPushY(){
        Stack stack = new Stack();
        stack.push("Bra");
        assertEquals(1, stack.getSize());
    }

    @Test
    public void stackCanPushXAndY(){
        Stack stack = new Stack();
        stack.push("Bra");
        stack.push("Pant");
        assertEquals(2, stack.getSize());
    }

    @Test
    public void stackCanPeekY(){
        Stack stack = new Stack();
        stack.push("Bra");
        stack.push("Pant");
        assertEquals(2, stack.getSize());
        stack.peek();
        assertEquals("Pant", stack.peek());
    }

    @Test
    public void stackCanPopY(){
        Stack stack = new Stack();
        stack.push("Bra");
        stack.push("Pant");
        stack.push("Dido");
        stack.push("Vibrator");
        assertEquals(4, stack.getSize());
        stack.peek();
        assertEquals("Vibrator", stack.peek());
        stack.pop();
        stack.peek();
        assertEquals("Dido", stack.peek());
        assertEquals(3, stack.getSize());
    }

}
