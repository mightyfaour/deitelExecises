package chapterFour;

import java.util.Scanner;

public class GasMileage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milesDriven = 0;
        int gallonUsed = 0;
//        double milesPerGallon = 0;
//        double average = 0;
        int counter = 0;

        System.out.println("Enter distance travelled (miles) and -1 to exit: ");
        int miles = scanner.nextInt();

        while (miles != -1){
            milesDriven = milesDriven + miles;
            counter = counter + 1;
            miles = scanner.nextInt();
        }

        System.out.println("Enter gallon used (litres) per trip and -1 to exit: ");
        int gallon = scanner.nextInt();

        while (gallon != -1){
            gallonUsed = gallonUsed + gallon;
            gallon = scanner.nextInt();
        }

        if (counter != 0){
            double milesPerGallon = (double) milesDriven / gallonUsed;

            System.out.println("miles driven is : " + milesDriven);
            System.out.println("gallon used is : " + gallonUsed);
            System.out.println("milesPerGallon is : " + milesDriven + " / " + gallonUsed + " = " + milesPerGallon);

        }
        else {
            System.out.println("no number entered");}



    }
}
