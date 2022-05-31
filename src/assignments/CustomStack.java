package assignments;

public class CustomStack {
    String[] stack = new String[10];
    private int counter;

    public void push(String item) {
        stack[counter] = item;
        counter++;
    }

    public int getNoOfItems() {

        return counter;
    }


    public void pop() {
        counter--;
    }


    public String peek() {
        return stack[counter-1];
    }

    public boolean isFull() {

        if(stack.length >= 10){
            return true;
        }
        else return false;
    }

    public boolean isEmpty() {
        if (counter == 0){
            return true;
        }
        else return false;
    }

    public void pushMultipleItems( String items) {
        if (counter < stack.length) {
            stack[counter] = items;
            counter ++;
        }
        else if (counter == stack.length) {
            String[] stack2 = new String[stack.length * 2];
            for (int i = 0; i < counter; i++) {
                stack2[i] = stack[i];
            }

            stack = stack2;
            stack[counter] = items;
            counter++;
        }
    }
}
