package chapterTwo;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second integer: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;

        int average = sum / 3;

        int product = firstNumber * secondNumber * thirdNumber;

        System.out.printf("sum is %d\n ", sum );
        System.out.printf("product is %d\n", product);
        System.out.printf("average is %d\n", average);

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.printf("%d is the largest.\n", firstNumber);
        }
        else if (secondNumber > firstNumber  && secondNumber > thirdNumber){
            System.out.printf("%d is the largest.\n", secondNumber);
            }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.printf("%d is largest.\n", thirdNumber);
        }
        if (firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.printf("%d is the smallest.\n", firstNumber);
        }
        else if (secondNumber < firstNumber  && secondNumber < thirdNumber){
            System.out.printf("%d is the smallest.\n", secondNumber);
        }
        else if (thirdNumber < firstNumber && thirdNumber < secondNumber){
            System.out.printf("%d is smallest.\n", thirdNumber);
        }

    }
}
