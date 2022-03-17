package chapterTwo;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        double firstNumber = input.nextInt();

        System.out.println("Enter second number ");
        double secondNumber = input.nextInt();

        double firstNumberSqr =  firstNumber * firstNumber;
        double secondNumberSqr = secondNumber * secondNumber;

        double sum = firstNumberSqr + secondNumberSqr;

        double difference = firstNumberSqr - secondNumberSqr;

        System.out.println("the square of the first number is " +firstNumberSqr);
        System.out.println("the square of the second number is " +secondNumberSqr);
        System.out.println("the sum of the first and second numbers is " +sum);
        System.out.println("the difference of the first and second numbers is " +difference);


    }
}
