package assignments;

import java.util.Objects;

public class CustomArray {

    private String[] array = new String[10];
    private int counter;


    public void add(String names) {
        if (counter < array.length) {
            array[counter] = names;
            counter ++;
        }

        else if (counter == array.length) {
            String[] array2 = new String[array.length * 2];
            for (int i = 0; i < counter; i++) {
                array2[i] = array[i];

            }
            array = array2;
            array[counter] = names;
            counter++;
        }
    }


    public int size() {
        counter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] != null)
                counter++;
        return counter;
    }

    public boolean get(String userName) {
        for (int i = 0; i < array.length; i++)
            if (Objects.equals(userName, array[i])) {
                return true;
            }
        return false;
    }

    public void modify(int index, String newUsername) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[index] = newUsername;
            }
        }

    }

    public void remove(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array[i] = null;
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
        }
        counter--;

    }

    public boolean getModified(int index, String userName) {
        if (Objects.equals(array[index], userName)) {
            return true;
        } else

            return false;
    }

    public String[] getArray() {
        return array;
    }


    public void addByIndex(int index, String name) {

        if (counter < array.length) {
            array[index] = name;
            counter ++;
        }

    }
}
