package tddClass;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++){
            for (int j =1; j<= 12; j++){
                System.out.printf("%2d X %d = %d |  ", j, i, j * i);
            }
            System.out.println("###########################");
        }
    }
}
