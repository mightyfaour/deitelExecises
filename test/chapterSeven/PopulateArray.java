package chapterSeven;

import org.w3c.dom.ls.LSOutput;

public class PopulateArray {
    public static void main(String[] args) {
        int[] number = {1,2,6};
        int sum = 0;

        for (int i = 0; i < number.length; i++){
            sum = sum + number[i];

            System.out.printf("++  Index number is:[%d] element %d  ++\n", i, number[i] );

        }
        System.out.printf("++  Total sum of numbers is: %s     ++\n", sum);

        System.out.println("==============================================");




        int[][] dNumber = {{1,2},{3,4}};
        for(int j = 0; j < dNumber.length; j++) {
            for (int k = 0; k < dNumber[j].length; k++) {
                sum += dNumber[j][k];
                System.out.printf("= [%d] | [%d] | %d  =\n", j, k, dNumber[j][k]);
                System.out.print("= --  --  --  -- =\n");

            }
        }
        System.out.printf("= sum of numbers is: %d =", sum);
    }


}
