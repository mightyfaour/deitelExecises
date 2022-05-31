package assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CustomArrayTest {

    private CustomArray array;

    @BeforeEach
    public void setUp() {
        array = new CustomArray();

    }

    @Test
    public void testThatArrayListCanBeCreated() {
        assertNotNull(array);
    }

    @Test
    public void testThatMultipleItemsCanBeAdded() {
        array.add("Philip");
        array.add("Love");
        array.add("Amaka");
        array.add("Segun");
        array.add("Mercy");
        array.add("Stephen");
        array.add("Neo");
        array.add("Tolani");
        array.add("Funmilayo");
        array.add("Florence");
        array.add("Cynthia");
        array.add("Morufy");
        System.out.println(Arrays.toString(array.getArray()));
        assertEquals(12, array.size());

    }

    @Test
    public void testThatUsernamesCanBeAddedByIndexAndName() {
        array.addByIndex(0, "Philip");
        array.addByIndex(1, "Bimbo");
        array.addByIndex(2, "Jumoke");
        array.addByIndex(3, "Gloria");
        array.addByIndex(4,"James");
        System.out.println(Arrays.toString(array.getArray()));
        assertEquals(5, array.size());

    }

    @Test
    public void changeUsernameTest() {
        array.add("Omotola");
        array.add("Love");
        array.add("Sandra");
        array.add("Tomiwa");
        array.modify(0, "Tolulope");
        System.out.println(Arrays.toString(array.getArray()));
        boolean isUsernameModified = array.getModified(0, "Tolulope");
        assertTrue(isUsernameModified);

    }

    @Test
    public void deleteUsernameTest() {
        array.add("Omotola");
        array.add("Love");
        array.add("Sandra");
        array.add("Tomiwa");
        array.add("Okoro");
        array.add("Joshua");
        array.remove(1);
        System.out.println(Arrays.toString(array.getArray()));
        assertEquals(5, array.size());

    }

    @Test
    public void testThatItemCanBeFound(){
        array.add("Omotola");
        array.add("Love");
        array.add("Sandra");
        array.add("Tomiwa");
        array.add("Okoro");
        array.add("Joshua");
        System.out.println(Arrays.toString(array.getArray()));
        assertTrue(array.get("Omotola"));

    }
}
