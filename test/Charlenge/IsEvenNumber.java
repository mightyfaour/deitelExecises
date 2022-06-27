package Charlenge;

public class IsEvenNumber {
//    public static void main(String[] args) {
//        int number = 4;
//        int finishedNumber = 20;
//        while (number <= finishedNumber){
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
//    }
//
//    private static boolean isEvenNumber(int number) {
//        if ((number %2) == 0){
//            return true;
//        }else{
//        return false;
//        }
//          }
//    Challenge:
//    modify the while code above
//    make it also record total number of even  number it has found
//    and break once 5 are found
//    and at the end, display the total number of even number found
//    ............................my solution........................................
//public static void main(String[] args) {
//    int number = 4;
//    int finishedNumber = 20;
//    int total = 0;
//    int count =1;
//    while (number <= finishedNumber) {
//        number++;
//        if (count <= 5) {
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            total += number;
//            count++;
//            System.out.println("Even number " + number);
////        System.out.println("index number " + total);
////        for (int i = 0; i < number ; i++) {
////            System.out.println("sum = " +count);
////
////        }
//        }
//    }
//    System.out.println(total);
//}
//
//    private static boolean isEvenNumber(int number) {
//        if ((number % 2) == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    ...........................His solution...........................................

    public static void main(String[] args) {
        int number = 4;
        int finishedNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishedNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            evenNumberFound++;
            System.out.println("Even number " + number);
            if (evenNumberFound >= 5){
                break;
            }

        }
        System.out.println("Total even Number found "+ evenNumberFound);
    }

    private static boolean isEvenNumber(int number) {
        if ((number %2) == 0){
            return true;
        }else{
        return false;
        }
          }
}
