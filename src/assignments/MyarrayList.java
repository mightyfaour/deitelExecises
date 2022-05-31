package assignments;

public class MyarrayList {
    private int counter;
    private int [] arrayList = new int[10];

    public boolean isEmpty() {
    return true;
    }

    public void add(int index, int element) {
        arrayList [index] = element;
        counter++;    }

    public int size() {
        return counter;
    }

    public int get(int index) {
        return arrayList[0];
    }

    public int indexOf(int index) {
        return arrayList[index];
    }

    public int remove(int index) {
        return arrayList[index];
    }
}
