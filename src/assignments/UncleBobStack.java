package assignments;



public class UncleBobStack {

    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(int element) {
        isEmpty = false;

    }
}
