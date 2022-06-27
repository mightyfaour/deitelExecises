package chapterfive;

import java.util.Scanner;


public class Extremes {
    public static void main(String[] args) {
        int max=0;
        int min=0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many values should be processed? ");
        int value = input.nextInt();

        for (int i = 0; i <value ; i++) {
            int number =i+1;
            System.out.println("enter number "+number);
            int val =input.nextInt();
            if (i==0) {
                max = val;
                min = val;
                System.out.println("in i==0 "+min);
                System.out.println("in i==0 "+max);
            }
            else {
                if (val>max) {
                    max=val;
                    System.out.println("in else if "+min);
                    System.out.println("in else if "+max);
                }
                if (val<min){
                    min=val;
                    System.out.println("in val<min "+min);
                    System.out.println("in val<min "+max);
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
        int total =max+min;
        System.out.println("the sum of extremes is "+ total);

        }

    }

