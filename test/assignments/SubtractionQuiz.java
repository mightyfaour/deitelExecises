package assignments;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " - " + number2 + " ?");
        int answer = scanner.nextInt();
        if (number1 - number2 == answer){
            System.out.println("You're Correct!");
            }
            else {
            System.out.println("You're Wrong!");
            System.out.printf("the correct answer is %d - %d = %d", number1, number2, answer );
        }
    }
}
