package Charlenge;

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            int number = input.nextInt();

            boolean isAnInt = input.hasNextInt();

            if (isAnInt) {
//                int number = input.nextInt();
                counter++;


            }
        }
    }
}
