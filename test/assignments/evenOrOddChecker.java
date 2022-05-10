package assignments;

import java.util.Scanner;

public class evenOrOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit: ");
        int number = input.nextInt();

        if (number % 2 == 0 ||number % 3 == 0)
        {
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is odd number");
        }


    }

}
