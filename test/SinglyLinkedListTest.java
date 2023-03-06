import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.platform.engine.support.hierarchical.Node;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList list;

    @BeforeEach
    public void startsWith(){
        list = new SinglyLinkedList();
    }

    @Test
    public void testThatSinglyLinkedListClassExist() {
        assertNotNull(list);
    }

    @Test
    public void singlyLinkedList_HasANode(){
        assertNull(list.getHead());
        assertNull(list.getTail());

    }

    @Test
    public void testThatNodeHasAnElement_And_ANext_Pointer(){
        Node<Integer> node = new Node<> (20, null);
        assertEquals(20, node.getElement());
        assertNull(node.getNext());
    }

    @Test
    public void testThatElementcanBeAddedToLinkedKist(){
        list.addToList(40);
        list.addToList(30);
        assertEquals(30, list.getTail());
        list.addToList(70);
        assertEquals(40, list.getHead());
        assertEquals(70, list.getTail());
        assertEquals(3, list.getSize());
    }

}