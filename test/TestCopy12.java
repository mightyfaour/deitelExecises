public class TestCopy12 {
    public static void main(String[] args) {
//        int value = 0;
//        int j = 1;
//        while (value < 10){
//            System.out.println(" * ");
//            while (j < 10){
//                System.out.print(" * " + j);
//                j = j + 1;
//            }
//            value = value + 1;
//        }
        for (int row = 0; row < 7; row++){
//            System.out.println("*");
            for (int column = 0; column <= row; column++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
