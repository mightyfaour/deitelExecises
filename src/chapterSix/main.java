package chapterSix;

import java.util.Scanner;

public class main {
    public static Divisible div = new Divisible();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Enter " + i  +"th numbers");
            int num = scanner.nextInt();
            div.setNumber(num);
            if (div.getNumber()) {
                System.out.println("correct");

            }
            else
                System.out.println("wrong");

        }
    }
}
