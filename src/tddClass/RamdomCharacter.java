package tddClass;

import java.security.SecureRandom;
import java.util.Random;

public class RamdomCharacter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String pass = passwordString();
            System.out.print(pass+" ");
        }

    }

    private static String passwordString() {
        String[] characters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "<", ">", ",", ".", "/", "?", ";",":"};
        String string = getRandomString(characters);
        return string;
    }

    private static String getRandomString(String[] characters) {
        SecureRandom random = new SecureRandom();
        int godds = random.nextInt(characters.length);
        return characters[godds];
    }
}
