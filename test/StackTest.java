//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StackTest {
//    private Stack stack;
//
//    @BeforeEach
//    public void setup(){
//        stack = new Stack();
//    }
//
//    @Test
//    public  void stackCanbeCreatedTest(){
//
//        assertNotNull(stack);
//    }
//
//    @Test
//    public void stack_isEmptyTest(){
//
//        assertTrue(stack.isEmpty());
//    }
//
//    @Test
//    public  void pushOneElemnt_stackIsNotEmptyTest(){
//
//        stack.push(13);
//        assertFalse(stack.isEmpty());
//    }
//    @Test
//    public  void pushX_popX_stackShouldBeEmptyTest(){
//        stack.push(13);
//        stack.pop();
//        assertTrue(stack.isEmpty());
//    }
//
//    @Test
//    public void  pushXabsY_popY_stackShouldNotbeEmpty(){
//        stack.push(13);
//        stack.push(3);
//        stack.pop();
//
//    }
//    @Test
//    public void pushX_popX_ElementShouldBeXtest(){
//        stack.push(34);
//        int element = stack.pop();
//        assertEquals(34,element);
//    }
//    @Test
//    public void pushXandY_popYandX_ElemenIsYthenXTest(){
//        stack.push(34);
//        stack.push(67);
//        int element = stack.pop();
//        assertEquals(50, element);
//    }
//}
