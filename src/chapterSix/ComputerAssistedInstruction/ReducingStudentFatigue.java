package chapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static int firstDigit;
    public static int secondDigit;
    public static int correctAnswer;
    public static int incorrectAnswer;
    public static int userInput, rand, randIncorrect;
        int repeatQuestion = firstDigit * secondDigit;

    public static void main(String[] args) {
        runReducingStudentFatigue();
    }
    public static void randCorrectFeedBack(){
        rand = secureRandom.nextInt(1, 4) + 1;
        switch (rand) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");

            default -> throw new IllegalStateException("Unexpected value: " + correctAnswer);
        }
    }

    public static void reference(){
        System.out.printf("How much is %d times %d ?   ", firstDigit, secondDigit);
        userInput = scanner.nextInt();
        if (userInput != correctAnswer) randIncorrectFeedBack();
        else randCorrectFeedBack();
    }
    public static void randIncorrectFeedBack(){
        randIncorrect = secureRandom.nextInt(1, 4);

        switch (randIncorrect) {
            case 1 -> {
                System.out.println("No. Please try again.");
                reference();
            }
            case 2 -> {
                System.out.println("Wrong. Try once more.");
                reference();
            }
            case 3 -> {
                System.out.println("Don't give up!");
                reference();
            }
            case 4 -> {
                System.out.println("No. Keep trying.");
                reference();
            }
            default -> throw new IllegalStateException("Unexpected value: " + correctAnswer);
        }
    }

    private static void runReducingStudentFatigue() {

        correctAnswer = firstDigit * secondDigit;

        int questionCount = 1;
        while (questionCount < 5) {
            runQuestions();

            if (userInput == correctAnswer) {
                randCorrectFeedBack();
            }
            if (userInput != correctAnswer) {
                randIncorrectFeedBack();

            }
            questionCount++;
        }
    }
    private static int runQuestions() {
        firstDigit = secureRandom.nextInt(2, 12);
        secondDigit = secureRandom.nextInt(2, 12);

        correctAnswer = firstDigit * secondDigit;
        System.out.printf("How much is %d times %d ?   ", firstDigit, secondDigit);
      return   userInput = scanner.nextInt();
    }
    private static void incorrectAnswers() {
        runReducingStudentFatigue();

    }
}
