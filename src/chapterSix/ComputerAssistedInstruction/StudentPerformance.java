package chapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class StudentPerformance {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);

    public static int firstDigit;

    public static int secondDigit;

    public static int correctAnswer;
    public static int inCorrectAnswer;

    public static int userInput, rand, randIncorrect;
    public static int correctCounter = 0;
    public static int incorrectCounter = 0;

    int repeatQuestion = firstDigit * secondDigit;

    public static void main(String[] args) {
        runStudentPerformance();
    }





    private static void runStudentPerformance() {
        for (int i = 1; i <= 10; i++) {
            firstDigit = secureRandom.nextInt(1, 12);
            secondDigit = secureRandom.nextInt(1, 12);
            System.out.printf("(%d) How much is %d times %d ?%n", i,  firstDigit, secondDigit);
            userInput = scanner.nextInt();
            correctAnswer = firstDigit * secondDigit;

            if (userInput == correctAnswer) {
                correctCounter++;


            } else {
                incorrectCounter++;

            }

        }
        runPercentageResult();
    }

    private static void runPercentageResult() {
        int CorrectPercentage = correctCounter / 10 * 100;
        int incorrectPercentage = correctCounter / 10 * 100;
        System.out.println("you got " + correctCounter + " correct answer");
        System.out.println("you got " + incorrectCounter + " incorrect answer");
        System.out.println("your correct percentage " + CorrectPercentage + " correct answer");
        System.out.println("you incorrect percentage " + incorrectPercentage + " correct answer");
    }


}