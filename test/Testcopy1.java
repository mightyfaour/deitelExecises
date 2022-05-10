import java.util.Scanner;

public class Testcopy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value1: ");
        double value1 = scanner.nextInt();

        System.out.println("Enter opCode you want (a, s, m, d): ");
        String op = scanner.next();
        op = op.toUpperCase();
        char opcode = op.charAt(0);

        System.out.println("Enter value2: ");
        double value2 = scanner.nextInt();

        double result;

        if (opcode == 'a') result = value1 + value2;
        else if (opcode == 's') result = value1 - value2;
        else  if (opcode == 'm') result = value1 * value2;
        else if (opcode == 'd') result = value1 / value2;
        else {
            result = 0.0d;
        }

        System.out.println(result);

    }

}
