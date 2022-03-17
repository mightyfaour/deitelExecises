package chapterTwo;

import java.util.Scanner;

public class DPanedrum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int FirstNumber = input.nextInt();

        System.out.println("Enter 2nd number: ");
        int SecondNumber = input.nextInt();

        System.out.println("Enter 3rd number: ");
        int ThirdNumber = input.nextInt();

        if(FirstNumber != ThirdNumber) {
            System.out.println("It's not palindrome");
        }
        {
            System.out.println("it's a palindrome");
        }


    }
}
