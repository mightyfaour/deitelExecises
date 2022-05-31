package assignments;

public class CustomQueue {
    int[] queue = new int[10];

    private int counter;

    public void enqueue(int item) {
        queue[counter] = item;
        counter++;
    }

    public int getNoOfItems() {

        return counter;
    }

    public int dequeue() {
        counter--;
        int remove = queue[0];
        for (int i = 0; i < queue.length-1; i++) {
            queue[i] = queue[i + 1];

        }
        return remove;
    }
}
