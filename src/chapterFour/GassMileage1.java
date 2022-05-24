package chapterFour;

import java.util.Scanner;

public class GassMileage1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTrips = 0;
        int milesDriven = 0;

        System.out.println("Enter number of trips: ");
        numberOfTrips = scanner.nextInt();
        int noOfTrips=numberOfTrips;
        int sumOfMilesDriven=0;
        int sumOfGallonUsed = 0;
        double averageOfMiles = 0;
        double averageOfGallonUsed = 0;
        double totalAveraging = 0;



        while (numberOfTrips >= 1){
            System.out.println("Enter miles per trip");
            milesDriven = scanner.nextInt();
            sumOfMilesDriven=sumOfMilesDriven+milesDriven;
            System.out.println("Enter gallon used per trip: ");
            int gallonUsed = scanner.nextInt();
            sumOfGallonUsed += gallonUsed;
            double display = (double)milesDriven / gallonUsed;
            System.out.println(display + " milesPerGallon for each trip");
            numberOfTrips--;
        }
        System.out.println("sum of miles driven is: "+ sumOfMilesDriven);
        System.out.println("sum of gallon used is: " + sumOfGallonUsed);

        averageOfMiles = (double)sumOfMilesDriven / noOfTrips;
        System.out.println("average of mile driven is: " + averageOfMiles);

        averageOfGallonUsed = (double)sumOfGallonUsed / noOfTrips;
        System.out.println("average of miles driven is: " + averageOfGallonUsed);

        totalAveraging = averageOfMiles / averageOfGallonUsed;
        System.out.println("Total average is : " + totalAveraging);

    }
}
