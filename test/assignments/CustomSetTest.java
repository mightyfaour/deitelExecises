package assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomSetTest {
    CustomSet set;

    @BeforeEach
    public void setUp(){
        set = new CustomSet();
    }


    @Test
    public void testThatSetCanBeCreated(){
        assertNotNull(set);
    }

    @Test
    public void testThatSetIsEmptyUponCreation(){
        boolean isEmpty = set.size();
        assertTrue(isEmpty);
    }

    @Test
    public void testThatSetCanTakeInValues(){
        CustomSet.add("Book1");
        CustomSet.add("Book2");
        CustomSet.add("Book3");
        assertEquals("Book4", CustomSet.add("Book4"));

    }

    @Test
    public void testThatSetCannotTakeDuplicateValues() throws CustomSet.DuplicatedValueException {
        CustomSet.add("Book1");
        CustomSet.add("Book2");
        CustomSet.add("Book3");
        CustomSet.add("Book1");
        assertTrue(CustomSet.duplicatesValuesAreNotAllowed("Book1"));
    }

    @Test
    public void testThatSetCanClearAllItems(){
        CustomSet.add("Book1");
        CustomSet.add("Book2");
        CustomSet.add("Book3");
        CustomSet.clearSet();
        boolean isSetEmpty = set.size();
        assertTrue(isSetEmpty);
    }
}
