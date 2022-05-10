package chapterThree;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        int acounter = 0;
        int bcounter = 0;
        int ccounter = 0;
        int dcounter = 0;

        for(int i = 1; i <= 5; i ++){
        Scanner input = new Scanner(System.in);
        System.out.println("enter student name: ");
         input.next();

        System.out.println("enter student grade: ");
        String grade = input.next().toUpperCase();


         switch (grade)  {
             case "A":
                 acounter++;
                break;

             case "B":
                 bcounter++;
                 break;

             case "C":
                 ccounter++;

                 break;

             case "D":
                 dcounter++;
                 break;

         }


        }

                 System.out.println(acounter+ "grade A");
                 System.out.println(bcounter+ "grade B");
                 System.out.println(ccounter + "grade C");
                 System.out.println(dcounter + "grade D");







    }
}
