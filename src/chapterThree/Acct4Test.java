package chapterThree;

import java.util.Scanner;

public class Acct4Test {
    public static void main(String[] args) {
        Acct4 account1 = new Acct4("Chiamaka", 500.00);
        Acct4 account2 = new Acct4("Demola", 300);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposited amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance %.2f%n", account2.getName(), account2.getBalance());

        System.out.println("Enter Deposited amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.println("Enter amount to be withdrawn from account1: ");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);
        System.out.printf("%n subtracting %.2f from account1 balance%n%n", withdrawAmount);


        System.out.printf("%s balance %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance %.2f%n",account2.getName(), account2.getBalance());

        System.out.printf("Enter amount to be withdrawn from account2: ");
         withdrawAmount = input.nextDouble();
        System.out.printf("%n subtracting %.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        System.out.printf("%s balance %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance %.2f%n",account2.getName(), account2.getBalance());

    }

}
