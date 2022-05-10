package assignments;


import java.util.Scanner;
public class RandomPractice {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = keyboard.nextLine();
        System.out.print("Welcome " + name + "! Please answer the following questions:");

        int randomNumber1 =  (int)(100 * Math.random()) + 1;
        int randomNumber2 =  (int)(100 * Math.random()) + 1;

        int randomNumberAdd = randomNumber1 + randomNumber2;
        int randomNumberMul = randomNumber1 * randomNumber2;
        int randomNumberDiv = randomNumber1 / randomNumber2;
        int randomNumberRem = randomNumber1 % randomNumber2;
        double correct = 0;
        double percentageCorrect = correct * 25;


        System.out.print(randomNumber1 + " + " + randomNumber2 + " = ");
        int GuessRandomNumberAdd = keyboard.nextInt();
        if (GuessRandomNumberAdd == randomNumber1 + randomNumber2) {
            System.out.println("Correct!");
            correct++;
        }
        else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is " + randomNumberAdd);

            System.out.print(randomNumber1 + " * " + randomNumber2 + " = ");
            int GuessRandomNumberMul = keyboard.nextInt();
            if (GuessRandomNumberMul == randomNumber1 * randomNumber2) {
                System.out.println("Correct!");
                correct++;
            }
            else{
                System.out.println("Wrong!");
                System.out.println("The correct answer is " + randomNumberMul);
            }

            System.out.print(randomNumber1 + " / " + randomNumber2 + " = ");
            int GuessRandomNumberDiv = keyboard.nextInt();
            if (GuessRandomNumberDiv == randomNumber1 / randomNumber2) {
                System.out.println("Correct!");
                correct++;
            }
            else{
                System.out.println("Wrong!");
                System.out.println("The correct answer is " + randomNumberMul);


                System.out.print(randomNumber1 + " % " + randomNumber2 + " = ");
                int GuessRandomNumberRem = keyboard.nextInt();
                if (GuessRandomNumberRem == randomNumber1 % randomNumber2) {
                    System.out.println("Correct!");
                    correct++;
                }
                else{
                    System.out.println("Wrong!");
                    System.out.println("The correct answer is " + randomNumberRem);

                    System.out.println("You got " + correct + " correct answers.");

                    System.out.println("That's " + percentageCorrect + "%!");
                }
            }
        }
    }

}
