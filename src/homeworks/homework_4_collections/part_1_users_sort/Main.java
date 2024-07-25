package homeworks.homework_4_collections.part_1_users_sort;

//        Створити List Юзерів
//        - відсортувати  за  віком (зростання та спадання методом sort)
//        - відсортувати його за кількістю знаків в імені  (зростання/спадання)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //  Створення масиву тут недоречне, бо не дає доступ до різних функцій колекцій типу List<>
        //        User[] users = new User[3];
        //        users[0] = new User(1, "John", "Doe", 25, "john.doe@example.com");
        //        users[1] = new User(2, "Jane", "Smith", 30, "jane.smith@example.com");
        //        users[2] = new User(3, "Alice", "Johnson", 28, "alice.johnson@example.com");


        // Створюємо List Users
        List<User> users = new ArrayList<>();

        // Створимо і наповнюємо юзерами List<User>
                // User user1 = new User(1, "John", "Doe", 25, "john.doe@example.com");
                // userList.add(user1);

        users.add(new User(5, "John", "Doe", 25, "john.doe@example.com"));
        users.add(new User(10, "Jane", "Smith", 30, "jane.smith@example.com"));
        users.add(new User(7, "Alice", "Johnson", 28, "alice.johnson@example.com"));
        users.add(new User(4, "Bob", "Williams", 35, "bob.williams@example.com"));
        users.add(new User(1, "Sarah", "Brown", 32, "sarah.brown@example.com"));
        users.add(new User(6, "Michael", "Davis", 27, "michael.davis@example.com"));
        users.add(new User(3, "Emily", "Miller", 29, "emily.miller@example.com"));
        users.add(new User(8, "David", "Wilson", 31, "david.wilson@example.com"));
        users.add(new User(9, "Olivia", "Anderson", 26, "olivia.anderson@example.com"));
        users.add(new User(2, "James", "Taylor", 33, "james.taylor@example.com"));

        // Якщо колекція незмінна (immutable), а не динамічна, то можна використати: Arrays.asList чи List.of

        // List<User> users = Arrays.asList(new User(5, "John", "Doe", 25, "john.doe@example.com")), new User());
               // або
        // List<User> users = List.of(new User(5, "John", "Doe", 25, "john.doe@example.com")), new User());

        // Arrays.asList та List.of дозволяють створити списки з попередньо визначеними елементами, але вони будуть незмінні.


        // Сортуємо лямбда виразом
        users.sort(((o1, o2) -> o1.getAge() - o2.getAge())); // зростання
         System.out.println("Сортування за віком (зростання): " + users);

        users.sort(((o1, o2) -> o2.getAge() - o1.getAge())); // спадання
         System.out.println("Сортування за віком (спадання): " + users);

        // Через Comparator > та < id (додатково)
        users.sort(Comparator.comparing(User::getId));            // зростання id
        System.out.println("Сортування за id (зростання): " + users);

        users.sort(Comparator.comparing(User::getId).reversed()); // спадання id
         System.out.println("Сортування за id (спадання): " + users);


        //Сортовуємо за кількістю знаків в імені
        users.sort(Comparator.comparing(user -> user.getName().length()));  //зростання
        System.out.println("Сортування за кількістю знаків в імені (зростання): " + users);

        //  users.sort(Comparator.comparing(user -> user.getName().length()).reversed());  // НЕ ПРАЦЮЄ
        users.sort(Comparator.comparing(user -> ((User) user).getName().length()).reversed());  //спадання
        //Додавши приведення типу (User) до об'єкта user в лямбда-виразі Comparator.comparingInt, ми вказуємо, що об'єкти в колекції є типом User. Це дозволяє компілятору знайти метод getName() в класі User.
        System.out.println("Сортування за кількістю знаків в імені (спадання): " + users);

        // Виведення кожного посортованого user
               // for (User user : users) {
               //     System.out.println(user);}

    }
}
