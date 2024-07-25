package lessons.lesson_4_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class My_collections_2_sort {
    public static void main(String[] args) {

        // Різні способи сортування стрінгів за алфавітом

        // незмінний список Arrays.asList
        List<String> strings = Arrays.asList("12", "13", "586", "mather", "father", "into", "year", "apple");

        Collections.sort(strings);
        System.out.println("1 list" + strings);
        strings.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println("2 list" + strings);
        strings.sort((String::compareTo));
        System.out.println("3 list" + strings);
        strings.sort(Comparator.naturalOrder());
        System.out.println("4 list" + strings);
        strings.sort(Comparator.reverseOrder());
        System.out.println("4 z-a list" + strings);
    }
}
