package assignments;

public class EhancedLoop {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        for (int number:numbers) {
            System.out.print(number);
            System.out.println("square of number "+ number+" is "+number*number);
        }
    }
}
