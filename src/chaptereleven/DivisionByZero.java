package chaptereleven;

import java.util.Scanner;



public class DivisionByZero {
    public static void main(String[] args) {

        int numerator = input("Enter numerator: ");
        int denominator = input("Enter dominator: ");

        try {
            int appropriateQuotient = numerator / denominator;
            display(appropriateQuotient + "");
        }
        catch (ArithmeticException px) {
            display("you cannot be putting zero oh");
        }
    }

    private static int input(String prompt) {
        display(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        int returned = 0;
        try {
            returned = keyboardInput.nextInt();
        }
        catch (Throwable exception){
            display("you! are wrong");
            System.exit(3);
            return input(prompt);
        }

        return returned;
    }

    private static void display(String prompt){
        System.out.println(prompt);
    }
}
