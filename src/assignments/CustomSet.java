package assignments;
import java.util.ArrayList;
public class CustomSet {
    static ArrayList<String> set = new ArrayList<>();

    public static void clearSet() {
        set.clear();

    }

    public boolean size() {
        if (set.size() == 0) {
            return true;
        }
        return false;
    }

    public static String add(String items) {

        set.add(items);
        return items;

    }

    public static boolean duplicatesValuesAreNotAllowed(String item) throws DuplicatedValueException {

        try{
            if (set.add(item) == set.contains(item)) {

                throw new DuplicatedValueException("Duplicated values");

            }
            else
                set.add(item);
        } catch (DuplicatedValueException e) {
            e.printStackTrace();
        }
        return true;
    }

    static class DuplicatedValueException extends Throwable {
        public DuplicatedValueException(String duplicated_values) {
        }
    }
}
