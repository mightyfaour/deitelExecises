package chapterTwo;

public class Comparison {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String compareIntegers(int number1, int number2) {
        if (number1 < number2) return "less than";
        if (number1 > number2) return "greater than";
        if (number1 == number2) return "equal to";
        return null;
    }
    //public static void main(String[] args){
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter first number ");
//        double firstNumber = input.nextInt();
//
//        double
//
//        System.out.print("*********");
//        System.out.println();
//        System.out.println("*\t\t*");
//        System.out.println("*\t\t*");
//        System.out.println("*\t\t*");
//        System.out.println("*\t\t*");
//        System.out.print("*********");
//    }


}
