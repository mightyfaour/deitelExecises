package chapterFour;

import java.util.Scanner;

public class Decrypt1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int userInput1;
        int userInput2;
        int userInput3;
        int userInput4;
        int temp;

        System.out.println("ENTER THE FOUR ENCRYPTED DIGIT NUMBER ==>: ");
        System.out.println("Enter first number: ");
        userInput1 = input.nextInt();
        System.out.println("Enter first number: ");
        userInput2 = input.nextInt();
        System.out.println("Enter first number: ");
        userInput3 = input.nextInt();
        System.out.println("Enter first number: ");
        userInput4 = input.nextInt();

        temp = userInput1;
        userInput1 = userInput3;
        userInput3 = temp;

        temp = userInput2;
        userInput2 = userInput4;
        userInput4 = temp;

        userInput1 += 10;

        userInput2 += 10;
        userInput3 += 10;
        userInput4 += 10;

        userInput1 -= 7;
        userInput2 -= 7;
        userInput3 -= 7;
        userInput4 -= 7;





//        userInput1 *= 10;
//        userInput2 *= 10;
//        userInput3 *= 10;
//        userInput4 *= 10;



        System.out.println("Decrypted code is: " + " " + userInput1 + " - " + userInput2 + " - " + userInput3 + " - " + userInput4);
    }
}
