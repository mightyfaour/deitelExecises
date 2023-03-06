public class SinglyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    int size = 0;

    public T getHead() {
        if(head == null) return null;
        return head.getElement();
    }

    public Object getTail() {
        if (tail == null) return null;
        return tail.getElement();
    }

    public void addToList(T element) {
        Node<T> newNode = new Node<>(element, null);
        if (headIsEmpty()) head = newNode;
        else {
            setTailNextTo(newNode);
        }
        tail = newNode;
        size++;
    }

    private boolean headIsEmpty() {
        return head == null;
    }

    private void setTailNextTo(Node<T> newNode) {
        tail.setNextTo(newNode);
    }

    public int getSize() {
        return size;
    }


//    public class Node{
//        int element;
//        Node next;
//    }
}
