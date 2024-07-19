package lessons.lesson_3.okten;

import java.util.Arrays;
import java.util.List;

public class FunctionalDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(integer -> integer * integer)
                .forEach(System.out::println);
    }
}
