package chapterFour;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
//        int count = 0;
//        while (count== 0){
//            System.out.println("hi");
//            count++;
//   }
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Salesperson "+ (i+1) +" total sales: ");
        int number = scanner.nextInt();
        if(number > max)

         max = number;
        }
        System.out.println(max);


    }
}
