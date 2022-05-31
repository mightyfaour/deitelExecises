package assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TheArrayListTest {

    @Test
    public void ArrayListCanBeCreatedTest(){
        TheArrayList fruits = new TheArrayList();
        assertNotNull(fruits);
    }
    @Test
    public void elementsCanBeAddedToAnArrayListTest(){
        TheArrayList fruits = new TheArrayList();
        fruits.add("love");
        fruits.add("orange");
        fruits.add("guaver");
        fruits.add("mellon");
        fruits.add("apple");
        fruits.add("pineapple");
       // System.out.println(Arrays.toString(fruits.getArray()));
        assertEquals(6, fruits.size());

    }

    @Test
    public void elementCanBeAccessedByIndexTest(){
        TheArrayList fruits = new TheArrayList();
        fruits.add("love");
        fruits.add("orange");
        fruits.add("guaver");
        fruits.add("mellon");
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.get(0);
        assertEquals("love", fruits.get(0));
    }

    @Test
    public void elementCanBeRemovedByIndex(){
        TheArrayList fruits = new TheArrayList();
        fruits.add("love");
        fruits.add("orange");
        fruits.add("guaver");
        fruits.add("mellon");
        fruits.add("apple");
        fruits.remove(4);
        fruits.remove(2);
        assertEquals(3, fruits.size());
    }
    @Test
    public void elementCanBeRemovedByItem(){
        TheArrayList fruits = new TheArrayList();
        fruits.add("love");
        fruits.add("orange");
        fruits.add("guaver");
        fruits.add("mellon");
        fruits.add("apple");
        fruits.remove("apple");
        assertEquals(4, fruits.size());

    }



}
