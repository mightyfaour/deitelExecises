package assignments;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter multiplier");
        int multiplier = input.nextInt();

        for(int counter = 1; counter <= 12; counter ++){
            System.out.println(multiplier +" * " + counter +" = " + counter * multiplier);

        }
    }

}
