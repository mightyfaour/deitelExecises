package Charlenge;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while (true){
        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = input.hasNextInt();

            if (isAnInt){
                int number = input.nextInt();
                counter++;
                sum += number;
//                if (counter == 10){
//                    break;
//                }
            }else {
                System.out.println("Invalid Number!");
            }
            System.out.println("sum = "+sum);
            input.nextLine();
        }


        input.close();
    }
}
