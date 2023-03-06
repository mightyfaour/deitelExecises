import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {
//                Scanner scan = new Scanner(System.in);
//                int roll = scan.nextInt();
//                for (int i = 0; i < roll; i++) {
//                        int a = scan.nextInt();
//                        int b = scan.nextInt();
//                        int n = scan.nextInt();
//
//                        int sum = 0;
//                        int doubleNumber = 1;
//                        for (int j = 0; j < n; j++) {
//                                sum = sum + doubleNumber * b;
//                                System.out.print(sum+" ");
//                                doubleNumber = doubleNumber*2;
//
//                        }
////                        /////////////////////////////////////////////////////////////////////////
//                }

//                Scanner sc = new Scanner(System.in);
//                int t=sc.nextInt();
//
//                for(int i=0;i<t;i++)
//                {
//
//                        try
//                        {
//                                long x=sc.nextLong();
//                                System.out.println(x+" can be fitted in:");
//                                if(x>=-128 && x<=127)System.out.println("* byte");
//                                //Complete the code
//                                if (x) {
//
//                                } else {
//
//                                }
//                        }
//                        catch(Exception e)
//                        {
//                                System.out.println(sc.next()+" can't be fitted anywhere.");
//                        }
//
//                }

//                int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//                System.out.println(intArray[1]+" intArray ");
//                for (int i = 0; i < intArray.length; i++) {
////                        System.out.print( intArray[i] +" ");
//                        boolean k = (intArray[i] % 2 == 0);
//                        if(k == true) System.out.println(intArray[i]);
////                        System.out.println(k);
//
//                }
                Scanner sc=new Scanner(System.in);
                System.out.println("================================");
                for(int i=0;i<3;i++)
                {
                        String s1=sc.next();
                        int x=sc.nextInt();
                        //Complete this line
                        System.out.printf("%-15s%03d%n",s1,x );
                }
                System.out.println("================================");


        }




}
