package tddClass;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Fixtures {
    public static void main(String[] args) {

//    String my_email = "me@gmail.com";
//        System.out.println(my_email.indexOf("@"));
//        System.out.println(my_email.charAt(2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your e-mail address: ");
        String e_mail = scanner.next();

        System.out.println("Your e-mail "+ e_mail +" contains "+ e_mail.length()+ " Characters");

        String[] strings = new String[e_mail.length()];
        for (int i = 0; i < e_mail.length(); i++) {


        }


    }
}
