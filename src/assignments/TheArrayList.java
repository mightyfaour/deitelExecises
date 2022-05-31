package assignments;

public class TheArrayList{
    int counter;

    String[] fruits = new String [10];

    public void add(String fruit) {
        fruits[counter] = fruit;
            counter++;
    }

    public int size() {
        return counter;
    }

    public String get(int index) {
        String myFruit = null;
        for (int i = 0; i < fruits.length ; i++) {
            if (index == i){
                myFruit = fruits[index];
                return myFruit;
            }
        }
        return myFruit;
    }

    public int remove(int index) {
        counter--;
        return size();
    }

    public void remove(String item) {

    }
}
