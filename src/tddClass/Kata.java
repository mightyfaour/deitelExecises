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
}
