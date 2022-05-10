package assignments;

import java.util.Scanner;

public class Trial1 {
    //Write an if statement that assigns 1 to x if y is greater than 0 .
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an integer 1 or 0: ");
        int y = input.nextInt();
        int x = 0;

        if (y > 0){
            System.out.println( x + 1);
        }

    }
}
