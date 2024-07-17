package lessons.lesson_1;

import java.math.BigDecimal;
import java.math.BigInteger;


// Бібліотеку Lombok не використовували на 1-у уроці!
public class Main {
    public static void main(String[] args) {

        // Виведення тексту в консоль
        System.out.println("Hello okten!");

        // Декларація змінної з використанням ключового слова var (доступно з Java 10)
        // Автоматичне визначення типу змінної
        var variable = "test"; // ONLY STRING, якщо в змінну визначили стрінгу
            // variable = "test2"; // valid // перевизначили
            // variable = 1; // not valid
            // variable = false; // not valid
        String str = "string text";
        Number num = 99;
        Boolean boo = true; // false



        // Порівняння рядків - 2 способи в Java:
             // - використання методу equals(), який порівнює значення рядків.
             // - використання оператора ==, який порівнює посилання на об'єкти.

        // 1 приклад
        String text = "lorem ipsum";
        String newText = new String("lorem ipsum"); // створ. нову комірку
        String oldText = "lorem ipsum";

        // Використання методу equals() для порівняння значень рядків
        System.out.println(text.equals(newText)); // true, бо "lorem ipsum" = "lorem ipsum"
        // Використання оператора == для порівняння посилань
        System.out.println(text == newText); // false, бо 2 різні об'єкти
        System.out.println(text == oldText); // true, бо text і oldText посилаються на один і той же об'єкт у стрічковому пулі (String pool)

        // 2 приклад
        String a = "hello";
        String b = "hello";
        System.out.println(a == b); // true, оскільки обидва літерали посилаються на один об'єкт у стрічковому пулі

        // 3 приклад з використанням конструктора:
        String c = "hello";
        String d = new String("hello");
        System.out.println(c == d); // false, оскільки b посилається на новий об'єкт
        System.out.println(c.equals(d)); // true, оскільки значення однакові

        // 4 приклад з методом intern():
        String a1 = new String("hello");
        String b1 = "hello";
        String c1 = a1.intern(); // повертає посилання на стрічковий пул
        System.out.println(a1 == b1); // false, оскільки a є новим об'єктом
        System.out.println(b1 == c1); // true, оскільки c посилається на стрічковий пул





        // Примітивні типи даних
        boolean bool = true; // false

        byte b2 = 127; // -128 до 127
        short s2 = 32767; // 2 ^ 15 - 1
        int i2 = 2_000_000_000; // 2 ^ 31 - 1
        long l2 = 200043343434L; // 2 ^ 63 - 1

        double d2 = 2.32; // Дійсне число з подвійною точністю
        BigDecimal bd = new BigDecimal("2.32"); // Використовується для високоточної арифметики з плаваючою точкою
        BigInteger bi = new BigInteger("32"); // Використовується для великих цілочислових значень

        float f2 = 3.14F; // Дійсне число з одинарною точністю, вимагає суфікс 'F'

        char c2 = 83; // ASCII значення символу 'S'
        System.out.println(c2); // Виведе символ 'S'






        // Виклик статичного методу з іншого класу
        Test.printHello();
        // PrivatePrint.printHello(); - недоступно через private модифікатор
        // PackagePrivatePrint.printHello(); - недоступно через package-private модифікатор

        // Модифікатори доступу:
        // private - доступно тільки в межах класу
        // protected - доступно в межах класу і підкласів
        // <no modifier> (package-private) - доступно в межах пакету
        // public - доступно всюди


        // Створення об'єкта Product з використанням першого конструктора
        Product laptop = new Product("Ноутбук", new BigDecimal("20000"));
        System.out.println(laptop.getName()); // Виведення назви ноутбука
        System.out.println(laptop.getPrice()); // Виведення ціни ноутбука

        laptop.setPrice(new BigDecimal("15000")); // Зміна ціни ноутбука
        System.out.println(laptop.getPrice()); // Виведення нової ціни ноутбука
        System.out.println("Quantity: " + laptop.getQuantity()); // Виведення кількості ноутбуків (за замовчуванням 0)
        System.out.println("Description: " + laptop.getDescription()); // Виведення опису ноутбука (за замовчуванням null)


        // Використання змінної з типом var для створення об'єкта Product
        var pencil = new Product("Олівець", new BigDecimal("10"));

        // Наповнимо масив ArrayList<String> reviews новими review!
        pencil.addReview("Хороший олівець"); // Додавання відгуку про олівець
        pencil.addReview("Поганий олівець"); // ще один відгук
        pencil.addReview("Простий олівець"); // ще один

        System.out.println(pencil.getReviews()); // Виведення всіх відгуків про олівець




        // Ітерація масиву reviews різними циклами

        // Використання циклу for з індексом для ітерації по елементах ArrayList
        for (int i = 0; i < pencil.getReviews().size(); i++) {
            String review = pencil.getReviews().get(i);
            System.out.println(review);
        }

        // або
        for (int index = 0; index < pencil.getReviews().size(); index++) {
            System.out.println(pencil.getReviews().get(index)); // Виведення кожного відгуку
        }



        // Використання розширеного циклу for для ітерації по елементах ArrayList
        for (String review : pencil.getReviews()) {
            System.out.println(review);
        }



        // Використання циклу while для ітерації по елементах ArrayList
        int index = 0;
        while (index < pencil.getReviews().size()) {
            String review = pencil.getReviews().get(index);
            System.out.println(review);     // Виведення кожного відгуку
            index++;    // Збільшення значення змінної index на 1
        }



        // Умова if для перевірки наявності відгуків
        if (pencil.getReviews().size() > 0) {
            System.out.println("Олівець має відгуки"); // Виведення повідомлення, якщо олівець має відгуки
        }

        // або
        if (!pencil.getReviews().isEmpty()) {
            System.out.println("Олівець має відгуки"); // Виведення повідомлення, якщо олівець має відгуки
        }


    }

}
