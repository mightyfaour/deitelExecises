package chapterFour;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
       int wrongAnswer= 0;
       int correctAnswer= 0;
       int userAdjustedScore = 0;

        for (int i = 1; i <= 10; i++) {
            int userInput = random.nextInt(5);
            int number1 = random.nextInt(50);
            int number2 = random.nextInt(50);
            int initialAnswer;
            int userAnswer;

            switch (userInput) {
                case 1 -> {
                    initialAnswer = number1 + number2;
                    System.out.printf("%d + %d = ", number1, number2);
                    userAnswer = input.nextInt();
                    if (initialAnswer == userAnswer) {
                        System.out.println("Correct!");
                        correctAnswer++;
                    } else {
                        System.out.println("Wrong!");
                        wrongAnswer++;
                    }
                }
                case 2 -> {
                    if (number1 > number2) {
                        initialAnswer = number1 - number2;
                        System.out.printf("%d - %d = ", number1, number2);
                    } else {
                        initialAnswer = number2 - number1;
                        System.out.printf("%d - %d = ", number2, number1);
                    }
                    userAnswer = input.nextInt();
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                }
                case 3 -> {
                    initialAnswer = number1 * number2;
                    System.out.printf("%d * %d = ", number1, number2);
                    userAnswer = input.nextInt();
                    if (initialAnswer == userAnswer) {
                        System.out.println("Correct!");
                        correctAnswer++;
                    } else {
                        System.out.println("Wrong!");
                        wrongAnswer++;
                    }
                }
                case 4 -> {
                    if (number1 > number2) {
                        initialAnswer = number1 / number2;
                        System.out.printf("%d / %d = ", number1, number2);
                    } else {
                        initialAnswer = number2 / number1;
                        System.out.printf("%d / %d = ", number2, number1);
                    }
                    userAnswer = input.nextInt();
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                }
            }

        }

        System.out.println("correctAnswers " +correctAnswer);
        System.out.println("wrongAnswers " +wrongAnswer);
        System.out.printf(" adjustedScore is %d - %d = %d ", correctAnswer,wrongAnswer,userAdjustedScore );

    }
}
