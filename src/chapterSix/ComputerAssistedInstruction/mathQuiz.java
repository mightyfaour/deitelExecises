package chapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class mathQuiz {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static int firstDigit;
    public static int secondDigit;
    public static int correctAnswer;
    public static int userInput;
    public static void main(String[] args) {
        runMathQuiz();
    }

    private static void runMathQuiz() {
        firstDigit = secureRandom.nextInt(2, 12);
        secondDigit = secureRandom.nextInt(2, 12);
        correctAnswer = firstDigit * secondDigit;
        System.out.printf("How much is %d times %d ?", firstDigit, secondDigit);
        userInput = scanner.nextInt();
        if (userInput == correctAnswer) {
            System.out.println(correctAnswer + " is Very good!");

        }
        else {
            System.out.println("No. Please try again.");
            incorrectAnswer();
        }

    }
    private static void incorrectAnswer() {
        runMathQuiz();
    }
}
