package tddClass;

public class SimpleCalculation {

    public int multiplicationResult;

    public int subtraction(int firstNumber, int secondNumber) {
        int subtractionResult = firstNumber - secondNumber;
        System.out.println("Your subtraction result is " + subtractionResult);
        return subtractionResult;
    }

    public int subtraction(int firstNumber, int secondNumber, int thirdNumber) {
        int subtractionResult = firstNumber - secondNumber - thirdNumber;
        return subtractionResult;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        int multiplicationResult = firstNumber * secondNumber;
        System.out.println("your multiplication result is " + multiplicationResult);
        return multiplicationResult;
    }
}
