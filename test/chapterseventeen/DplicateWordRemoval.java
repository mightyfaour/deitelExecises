package chapterseventeen;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class DplicateWordRemoval {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        input = input.toLowerCase();
        String[] elements = input.split(" ");

        List<String> straightList = Stream.of(elements)
                .sorted()
                .distinct().toList();

        System.out.println(straightList);
    }
}
