package chapterTwo;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit");
        int Number1 = input.nextInt();

        if (Number1 % 3 == 0) {
            System.out.println("Number is divisible by 3");
        }
        else {
            System.out.println("Not divisible by 3");
        }


    }
}
