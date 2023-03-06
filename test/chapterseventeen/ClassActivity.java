package chapterseventeen;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClassActivity {

    public class Statement {
        public static void main(String[] args) {
            System.out.println(IntStream.rangeClosed(1, 20)
                    .filter((x -> x % 2 != 0)).map(x -> x * x * x)
                    .sum());
            SecureRandom random = new SecureRandom();
            random.ints(10, 1, 7)
                    .filter((x -> x % 2 == 0))

                    .forEach(System.out::println);

       /*                   ^
                            |
        because its only returns a method ,we use a method reference
        */

            //to generate a stream of 20 numbers ranging from 1 to 13
            String  result = random.ints(20, 1, 13)
                    //                returning each element as a string value
                    .mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(result);
        }
    }
}
