package chapterFour;

import java.util.Scanner;

public class Cryptography2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;
        int userInput1;
        int userInput2;
        int userInput3;
        int userInput4;
        int temp;

        System.out.println("Enter your four digit number: ");
        userInput = input. nextInt();

        userInput1 = (((userInput % 10000) / 1000) + 7) % 10;
        userInput2 = (((userInput % 1000) / 100) + 7) % 10;
        userInput3 = (((userInput % 100) / 10) + 7) % 10;
        userInput4 = ((userInput % 10) + 7) % 10;

        temp = userInput1;
        userInput1 = userInput3;
        userInput3 = temp;
        temp = userInput2;
        userInput2 = userInput4;
        userInput4 = temp;

        System.out.println("Encrypted code is: " + " " + userInput1 + " - " + userInput2 + " - " + userInput3 + " - " + userInput4);


    }
}
