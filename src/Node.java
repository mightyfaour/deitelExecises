public class Node <T>{

    T element;
    Node<T> next;

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNextTo(Node<T> newNode) {
        next = newNode;
    }
}
