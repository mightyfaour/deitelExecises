package tddClass;

public class Kata {
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int sub(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else if (num1 < num2) {
            return num2 - num1;
        }
        return 0;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public int areaOfCircle(int radius){
        return (22 * radius * radius)/7;
    }

    public int flip(int numb) {
        if (numb == 1){
            return 0;
        }else if (numb == 0){
            return 1;
        }else return numb;
    }

    public boolean palindrome(int digit) {
        int num1 = digit % 10;
        int num2 = digit % 100;
        int num3 = digit % 1000;
        int num4 = digit % 10000;
        int num5 = digit % 100000;

        int mod5 = num5 / 10000;
        int mod4 = num4 / 1000;
        int mod3 = num3 / 100;
        int mod2 = num2 / 10;
        int mod1 = num1 / 1;

        if (mod5 == mod1 && mod4 == mod2) {
            return true;
        }
            return false;

    }

    public boolean isEvenNumber(int number) {
        if (number % 2 == 0){
            return true;
        }else if (number % 2 == 1){
            return false;
        }else return false;
    }


    public int biggestNumber(int digit0, int digit1, int digit2, int digit3, int digit4) {
        int biggestNumber = digit0;
        if (digit1 > biggestNumber){biggestNumber = digit1;}
        if (digit2 > biggestNumber){biggestNumber = digit2;}
        if (digit3 > biggestNumber){biggestNumber = digit3;}
        if (digit4 > biggestNumber){biggestNumber = digit4;}
        return biggestNumber;
        }


    public int Ddatatype(int digit ) {
        int countMultiples = 0;
        for (int i = 1; i <= digit; i++){
            if (digit % i == 0){
                ++countMultiples;
            }
        }return countMultiples;
    }

    public boolean PrimeNumber(int digit) {

//        int prime =0;
//        for (int i = 1; i <= digit; i++){
//            if (digit % i == 0){
//                ++prime;
//            }
//        }
//        if (prime <= 2){
//            return true;
//        }
//        return false;
        if (Ddatatype(digit) <= 2)return true;
        return false;

    }


}
