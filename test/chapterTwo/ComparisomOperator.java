package chapterTwo;

import java.util.Scanner;

public class ComparisomOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        int sqrNumber = number1 * number1;

        if (sqrNumber > 100) {
            System.out.println(sqrNumber + " is greater than 100");
        }
        else if (sqrNumber < 100){
            System.out.printf("%d < 100",  sqrNumber);
        }
        else if (number1 == sqrNumber){
            System.out.printf("%d == %d%n", number1, sqrNumber);
        }
        else if (number1 != sqrNumber){
            System.out.printf("%d != %d %n", number1, sqrNumber);
        }
        //else if ("")


    }
}
