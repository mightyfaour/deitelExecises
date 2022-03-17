package chapterTwo;

import java.util.Scanner;

public class NumberFlipper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a  number: ");
        int flipper = input.nextInt();

        if (flipper == 0) {
            System.out.println("1");
        } if (flipper == 1) {
            System.out.println("0");
        }
    }

}
