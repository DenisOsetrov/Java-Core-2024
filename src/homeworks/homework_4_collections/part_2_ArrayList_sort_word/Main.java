package homeworks.homework_4_collections.part_2_ArrayList_sort_word;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // незмінний список Arrays.asList
        List<String> words = Arrays.asList("apple", "orange", "banana", "grape", "pineapple",
                "mango", "kiwi", "strawberry", "blueberry", "raspberry",
                "blackberry", "watermelon", "melon", "peach", "cherry",
                "plum", "pear", "apricot", "lemon", "lime");


        // Сортуємо за алфавітом за допомогою Collections.sort() - сортує список у природному порядку
        Collections.sort(words);

        System.out.println("Відсортований список за алфавітом: " + words);

        // Сортуємо за алфавітом у зворотному порядку за допомогою Collections.sort() та Comparator.reverseOrder()
        Collections.sort(words, Comparator.reverseOrder());
        System.out.println(STR."Відсортований список (спадання): \{words}");



        // Сортуємо ArrayList за алфавітом
        words.sort((a, b) -> a.compareTo(b));
        // або
        // words.sort(String::compareTo);
        // words.sort(Comparator.naturalOrder()); // від а - я
        System.out.println("Відсортований список №2: " + words);

        // Сортування за алфавітом у зворотному порядку за допомогою List.sort() та Comparator.reverseOrder()
        words.sort(Comparator.reverseOrder());
        System.out.println("Відсортований список №2 зворотній: " + words);


    }
}
