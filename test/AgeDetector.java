import java.util.Scanner;

public class AgeDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your age");

        int age = scanner.nextInt();

        if (age < 0 || age > 120){
            System.out.println ( "Age either too low or too high");
        }
    }












}
