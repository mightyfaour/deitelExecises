public class StudentGrade {
    public static void main(String[] args) {

        int[][] student = /*new int[3][3];*/{{60, 65, 70}, {89, 67, 77},{54, 65, 47}} ;
        int sum = 0;

        for (int i = 0; i < student.length ; i++) {

            for (int j = 0; j < student[i].length; j++) {

                System.out.print(student[i][j] + " | ");
                sum += student[i][j];


            }

            System.out.println();
        }
        System.out.println(" " + sum);
        int sumOfEachStudent = 0;
        //for (int i = 0; i < student.length; i++) {
            for (int j = 0; j <student[1].length ; j++) {
                sumOfEachStudent += student[1][j];
            }

       // }
        System.out.println(sumOfEachStudent);
    }
}
