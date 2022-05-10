import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are in the class: ");
        int numberOfStudent = scanner.nextInt();

        System.out.println("Total number number of subjects: ");
        int numberOfSubject = scanner.nextInt();

        int[][] score = new int[numberOfStudent][numberOfSubject];
       // int[][] =new int[numberOfStudent][numberOfSubject]




        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Enter students grade: " + i);
//            String grade = scanner.nextLine();
            for (int j = 0; j < numberOfSubject; i++) {
               System.out.println("Enter student's score: " + j);
            }
        }
    }
}
