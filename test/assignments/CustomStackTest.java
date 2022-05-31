package assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomStackTest {
    CustomStack stack;

    @BeforeEach
    public void setUp() {
        stack = new CustomStack();

    }

    @Test
    public void testThatStackExist() {
        assertNotNull(stack);
    }

    @Test
    public void testThatStackCanPushItems() {
        stack.push("The Last Sumarai");
        stack.push("GiftedHands");
        assertEquals(2, stack.getNoOfItems());

    }

    @Test
    public void testThatStackCanPushMultipleItems() {
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Gifted Hands");
        stack.pushMultipleItems("Book 11");
        stack.pushMultipleItems("Book 12");
        assertEquals(12, stack.getNoOfItems());


    }

    @Test
    public void testThatStackCanPop() {
        stack.push("book1");
        stack.push("book2");
        stack.push("book3");
        stack.push("book4");
        stack.pop();
        assertEquals(3, stack.getNoOfItems());

    }

    @Test
    public void testThatStackCanPeek(){
        stack.push("book1");
        stack.push("book2");
        stack.push("book3");
        stack.push("book4");
        assertEquals("book4", stack.peek());
    }

    @Test
    public void testThatStackCanBeFull(){
        stack.push("Gifted Hands");
        stack.push("Rich Dad");
        stack.push("Eze goes to school");
        stack.push("Richest man in babylon");
        stack.push("Harry Potter");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("D");
        boolean isStackFull = stack.isFull();
        assertTrue(isStackFull);
    }

    @Test
    public void testThatStackIsEmpty(){
        //stack.push("book");
        boolean isStackEmpty = stack.isEmpty();
        assertTrue(isStackEmpty);

    }
}
