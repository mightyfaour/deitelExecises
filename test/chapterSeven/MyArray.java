package chapterSeven;

public class MyArray {
    public static void main(String[] args) {
        //linear array
        int[] num = new int[3];
        num[0] = 3;
        num[1] = 8;
        num[2] = 7;
        int[] numbers = {3, 8, 7};
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        //sum array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        //multidimensional array
        // have more than one row
        int[][] values = new int[3][4];
        //passing values to first row
        values[0][0] = 4;
        values[0][1] = 32;
        values[0][2] = 89;
        values[0][3] = 41;
        // passing values to second row
        values[1][0] =  64;
        values[1][1] = 46;
        values[1][2] = 4;
        values[1][3] = 60;
        // simpler way to go about it without initialising one by one
        int[][] digits = {{4, 32, 89, 41}, {64, 46, 4, 60}};

    }
}
