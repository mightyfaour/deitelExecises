package chapterThree;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.println("enter fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.println("enter fifth number: ");
        int fifthNumber = input.nextInt();

        for(int count = 0 ; count < firstNumber; count++){
            if ( firstNumber <= 30){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for(int count = 0 ; count < secondNumber; count++){
            if ( secondNumber <= 30){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for(int count = 0 ; count < thirdNumber; count++){
            if ( thirdNumber <= 30){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for(int count = 0 ; count < fourthNumber; count++){
            if ( fourthNumber <= 30){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for(int count = 0 ; count < fifthNumber; count++){
            if ( fifthNumber <= 30){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }


    }
}
