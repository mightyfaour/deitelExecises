package chapterTwo;

import java.util.Scanner;

public class CircumferenceOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = input.nextInt();

        float diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("%f is the diameter:\n ", diameter);
        System.out.printf("%f is the circumference: \n", circumference);
        System.out.printf("%f is the area: ", area);
    }
}
