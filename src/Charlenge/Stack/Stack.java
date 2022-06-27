package Charlenge.Stack;

public class Stack {
    private String[] elements = new String[10];
    private int numberElement;
    public void push(String element) {
        elements[numberElement] = element;
        numberElement++;
    }

    public int getSize() {
        return numberElement;
    }

    public String peek() {
        return elements[numberElement-1];
    }

    public void pop() {
        numberElement--;
        elements[numberElement] = null;
    }
}
