package chapterFour;

import java.util.Scanner;

public class Cryptography1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int userInput2;
        int userInput3;
        int userInput4;
        int temp;

        System.out.println("ENTER FOUR DIGIT NUMBER ==>: ");
        System.out.println("Enter first number: ");
        userInput = input.nextInt();
        System.out.println("Enter first number: ");
        userInput2 = input.nextInt();
        System.out.println("Enter first number: ");
        userInput3 = input.nextInt();
        System.out.println("Enter first number: ");
        userInput4 = input.nextInt();

        userInput +=  7;
        userInput2 += 7;
        userInput3 += 7;
        userInput4 += 7;

        userInput %= 10;
        userInput2 %= 10;
        userInput3 %= 10;
        userInput4 %= 10;

        temp = userInput;
        userInput = userInput3;
        userInput3 = temp;
        temp = userInput2;
        userInput2 = userInput4;
        userInput4 = temp;

        System.out.println("Encrypted code is: " + " " + userInput + " - " + userInput2 + " - " + userInput3 + " - " + userInput4);

    }
}
