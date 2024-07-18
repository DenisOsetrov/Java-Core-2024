package homeworks.homework_3_implements_interface.part_1_Printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1 спосіб: Масив Printable[] - має фіксований розмір і вищу продуктивність.
//        Printable[] printables = {
//                new Book("Serhiy Zhadan", "Інтернат", 2017, 336),
//                new Book("Oksana Zabuzhko", "Музей покинутих секретів", 2009, 832)
//        };


        // 2 спосіб: Список ArrayList<Printable> - Динамічний розмір та Гнучкість(має багато зручних методів)

        // створимо список, наповнимо його: книгами і журналами, і додамо!
        List<Printable> printables = new ArrayList<>();

        printables.add(new Book("Serhiy Zhadan", "Інтернат", 2017, 336));
        printables.add(new Book("Oksana Zabuzhko", "Музей покинутих секретів", 2009, 832));

        // Журнали спочатку створимо, наповнимо, а потім додамо:
        Magazine magazine1 = new Magazine("Esquire", "For Men", 45);
        Magazine magazine2 = new Magazine("National Geographic", "Science", 120);

        // Додавання журналів до списку
        printables.add(magazine1);
        printables.add(magazine2);

        for (Printable printable : printables) {
            printable.print();
        }

        // маємо ітерований вивід метода print():
        // Короткі відомості про книгу: назва книги - Serhiy Zhadan, автор книги - Інтернат, рік видання - 2017, кількість сторінок - 336.
        //Короткі відомості про книгу: назва книги - Oksana Zabuzhko, автор книги - Музей покинутих секретів, рік видання - 2009, кількість сторінок - 832.
        //Інформація про журнал: назва - Esquire, жанр - For Men, кількість сторінок - 45.
        //Інформація про журнал: назва - National Geographic, жанр - Science, кількість сторінок - 120.

    }
}
