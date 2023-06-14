package exercise2;
import java.util.*;
public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<String>();

        for (int i = 1; i < 100; i++) {
            numbers.add(getNumber(i));
        }
        return numbers;
    }
    private boolean isMultiple(int number, int multiple) {
        return number % multiple == 0;
    }
    private String getNumber(int i) {
        if (isMultiple(i, 3) && isMultiple(i, 5)) {
            return FIZZ + BUZZ;
        } else if (isMultiple(i,3)) {
            return FIZZ;
        } else if (isMultiple(i,5)) {
            return BUZZ;
        }
        return "" + i;
    }
}

