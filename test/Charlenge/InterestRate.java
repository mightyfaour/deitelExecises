package Charlenge;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter Amount: ");
        double principal = input.nextDouble();

        System.out.println("Enter time given (in years): ");
        int time = input.nextInt();

        System.out.println("Enter interest interestedRate: ");
        double interestedRate = input.nextDouble();


        for (int i = 0; i < interestedRate; interestedRate--) {
            System.out.println("Amount"+ " "+ principal + "Rate "+ interestedRate + "%" + " = "+ calculateInterestRate(principal, interestedRate, time));
            double total = calculateInterestRate(principal, interestedRate, time) + principal;
            System.out.println("Amount to be paid = "+ calculateInterestRate(principal, interestedRate, time) +" + "+ principal + " = "+total);
        }
    }


    private static double calculateInterestRate(double principal, double interestedRate, int time) {
        return (principal * time *(interestedRate/100));
    }


}
