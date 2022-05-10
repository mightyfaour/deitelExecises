package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
    private static double chargeForThreeHours = 2.0;
    private static double excessCharge = 0.5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of hours: ");
        int hours = input.nextInt();
        System.out.println(charge(hours));

    }
    private static double charge(int hours){
        double newCharge = 0.0;
        double charge = 0.0;
        if (hours > 3){
            int newHour = hours - 3;
             newCharge = newHour * excessCharge;
             charge = newCharge + chargeForThreeHours;
        }

        else{charge = chargeForThreeHours;}


        return charge;
    }
}
