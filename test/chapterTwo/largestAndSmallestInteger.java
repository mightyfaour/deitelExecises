package chapterTwo;

import java.util.Scanner;

public class largestAndSmallestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();

        System.out.println("Enter fourth number: ");
        int fourthNumber = input.nextInt();

        System.out.println("Enter fifth number: ");
        int fifthNumber = input.nextInt();

//        if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber ){
//            System.out.printf("%d is the largest number \n",firstNumber);
//        }
//        else if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber ){
//            System.out.printf("%d is the largest number \n ", secondNumber);
//        }
//        else if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){
//            System.out.println("%d is the largest number \n ", thirdNumber);
//        }
//        else if (fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){
//            System.out.println("%d is the largest \n", fourthNumber);
//        }
//        else if (fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){
//            System.out.println("%d is the largest number \n", fifthNumber);
//        }

        int largest = firstNumber;

        if(secondNumber > largest){largest = secondNumber;}
       if(thirdNumber > largest){largest = thirdNumber;}
       if (fourthNumber > largest){largest = fourthNumber;}
       if (fifthNumber > largest){largest = fifthNumber;}

      int smallest = firstNumber;

       if (secondNumber < smallest){smallest = secondNumber;}
       if (thirdNumber < smallest){smallest = thirdNumber;}
       if (fourthNumber < smallest){smallest = fourthNumber;}
       if (fifthNumber < smallest){smallest = fifthNumber;}


        System.out.println("largest number is "+largest);
        System.out.println("smallest number is " + smallest);
    }
}
