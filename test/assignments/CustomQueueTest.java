package assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomQueueTest {
    CustomQueue queue;

    @BeforeEach
    public void setUp(){
        queue = new CustomQueue();
    }

    @Test
    public void testThatQueueExist(){
        assertNotNull(queue);
    }

    @Test
    public void testThatQueueCanEnqueue(){
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.getNoOfItems());
    }

    @Test
    public void testThatQueueCanDequeue(){
        queue.enqueue(1);
        queue.enqueue(2);
        int result = queue.dequeue();
        assertEquals(1, result);
    }
}
