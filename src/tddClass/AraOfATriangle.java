package tddClass;

import java.util.Scanner;

public class AraOfATriangle {
    public static void main(String[] args) {
        Scanner goddsScanner = new Scanner(System.in);
        System.out.println("This program will find the area of a triangle whos' base is and A height is B");
        System.out.println("Please, enter the A side of a triangle (base):  ");
        int aSide = goddsScanner.nextInt();

        System.out.println("Please, enter the B side of the triangle (height): ");
        int bSide = goddsScanner.nextInt();

        System.out.println("Please, enter the C side of the triangle: ");
        int cSide = goddsScanner.nextInt();

        System.out.println("Chose a formular to to operate on:%n '1/2 base * hight' as X, or 'Heros formular' as Y?");
        String op = goddsScanner.next();
        op = op.toUpperCase();
        char opcode = op.charAt(0);
        System.out.println("If you're X formular, enter zero, 0 ans your value.");

        double result;
        double p = (aSide + bSide + cSide) / 2;


//        if (opcode == 'X') result = (aSide * bSide) / 2;
//        else if (opcode == 'Y') triangle = math.sqrt(p *(p - cSide)) / 2;

        System.out.println();

    }

}
