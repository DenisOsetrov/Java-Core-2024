package homeworks.homework_2_extends_class;

import homeworks.homework_2_extends_class.Additional.Comment;
import homeworks.homework_2_extends_class.Additional.Post;
import homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation.Laptop;
import homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation.PC;
import homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation.Ultrabook;
import homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation.Workstation;
import homeworks.homework_2_extends_class.Papyrus_Book_Magazine_Comics.Book;
import homeworks.homework_2_extends_class.Papyrus_Book_Magazine_Comics.Comics;
import homeworks.homework_2_extends_class.Papyrus_Book_Magazine_Comics.Magazine;
import homeworks.homework_2_extends_class.Papyrus_Book_Magazine_Comics.Papyrus;
import homeworks.homework_2_extends_class.User_model.Car;
import homeworks.homework_2_extends_class.User_model.Gender;
import homeworks.homework_2_extends_class.User_model.Skill;
import homeworks.homework_2_extends_class.User_model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

                            // Завдання 1. PC-Laptop-Ultrabook/Workstation
        System.out.println("Завдання 1. PC-Laptop-Ultrabook/Workstation");
        // Додатково:
            // - створимо і наповнимо об'єкти по 2 об'єкти!
            // - створимо масив для цих об'єктів і додамо їх туди
            // - виведемо кожен об'єкт окремо через цикл

        // PC
        PC pc1 = new PC(new BigDecimal("800"), "Dell", "Intel i5", 4, 8, 256, true);
        PC pc2 = new PC(new BigDecimal("850"), "HP", "Intel i7", 6, 16, 512, true);

        // Laptop
        Laptop laptop1 = new Laptop(new BigDecimal("1200"), "HP", "Intel i7", 6, 16, 512, true, "Spectre", 15, 10);
        Laptop laptop2 = new Laptop(new BigDecimal("1400"), "Lenovo", "AMD Ryzen 7", 8, 16, 512, true, "ThinkPad", 14, 12);

        // Ultrabook
        Ultrabook ultrabook1 = new Ultrabook(new BigDecimal("1800"), "Apple", "M1", 8, 16, 512, true, "MacBook Air", 13, 20, 1.25, "2560x1600");
        Ultrabook ultrabook2 = new Ultrabook(new BigDecimal("2000"), "Asus", "Intel i9", 8, 32, 1024, true, "ZenBook", 14, 15, 1.5, "3840x2160");

        // Workstation
        Workstation workstation1 = new Workstation(new BigDecimal("2500"), "Dell", "Intel Xeon", 12, 64, 2048, true, "Precision", 17, 24, 4096, true);
        Workstation workstation2 = new Workstation(new BigDecimal("3000"), "HP", "AMD EPYC", 16, 128, 4096, true, "Z Workstation", 17, 24, 8192, true);

        // Розміщення об'єктів у масиві. <Object> - об'єднує різні типи об'єктів, а метод toString у кожному класі їх виводить.
        // Ocкільки вони всі походять від PC, то можна використати тип <PC>.  List<PC> devices = new ArrayList<>();
        List<Object> devices = new ArrayList<>();
        devices.add(pc1);
        devices.add(pc2);
        devices.add(laptop1);
        devices.add(laptop2);
        devices.add(ultrabook1);
        devices.add(ultrabook2);
        devices.add(workstation1);
        devices.add(workstation2);

        // Ітерація через масив та виведення кожного об'єкта
        for (Object device : devices) {
            System.out.println(device);
        }
        System.out.println("*****************************************************************************");


        
        

                            // Завдання 2. Papyrus-Book-Magazine/Comics
        System.out.println("Завдання 2. Papyrus-Book-Magazine/Comics");
        // Додатково:
                // - створимо і наповнимо об'єкти по 2 об'єкти!
                // - створимо масив для цих об'єктів і додамо їх туди
                // - виведемо кожен об'єкт окремо через цикл

        // Створення об'єктів Papyrus
        Papyrus papyrus1 = new Papyrus("Egypt");
        Papyrus papyrus2 = new Papyrus("Greece");

        // Створення об'єктів Book
        Book book1 = new Book("USA", 1999, "John Doe");
        Book book2 = new Book("UK", 2005, "Jane Smith");

        // Створення об'єктів Magazine
        Magazine magazine1 = new Magazine("France", 2010, "Pierre Dupont", "Fashion");
        Magazine magazine2 = new Magazine("Italy", 2012, "Maria Rossi", "Cooking");

        // Створення об'єктів Comics
        Comics comics1 = new Comics("Japan", 2008, "Hiroshi Tanaka", "Superheroes", 1);
        Comics comics2 = new Comics("USA", 2015, "Stan Lee", "Avengers", 2);

        // Розміщення об'єктів у масиві
        // ArrayList<Papyrus> використовується для зберігання об'єктів різних типів (підкласів Papyrus), що демонструє поліморфізм і спадковість у Java.
        List<Papyrus> myCollection = new ArrayList<>();

        myCollection.add(papyrus1);
        myCollection.add(papyrus2);
        myCollection.add(book1);
        myCollection.add(book2);
        myCollection.add(magazine1);
        myCollection.add(magazine2);
        myCollection.add(comics1);
        myCollection.add(comics2);

        // Ітерація через масив та виведення кожного об'єкта
        for (Papyrus papyrus : myCollection) {
            System.out.println(papyrus);
        }
        System.out.println("*****************************************************************************");





                        // Завдання 3. User-model. Композиція і агрегація.
        //створимо клас User, де його skills - буде агрегацією, car - композицією, gender - enum.
        System.out.println("Завдання 3. User-model");


//        // Створення скілів
        Skill java = new Skill("java", 10);
        Skill js = new Skill("js", 10);
        Skill cpp = new Skill("c++", 10);

//        // Додавання скілів до списку
        List<Skill> skills = new ArrayList<>();
        skills.add(java);
        skills.add(js);
        skills.add(cpp);

//        // Створення car
        Car car = new Car("toyota", 2021, 250);

//        // Створення user - об'єкта, що включає в себе car-композицію (впливає на життєвий цикл), skills -
//        агрегацію (не володіє skills, а лише посилається на існуючі skills)
        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car);

        System.out.println(user);
        System.out.println("*****************************************************************************");




        // Завдання 3. Additional.
        System.out.println("Завдання 3. Additional.");

        // Створимо список коментарів і наповнимо його
        List<Comment> comments = new ArrayList<>();

        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(2, 7, "repellat consequatur praesentium vel minus molestias voluptatum", "Dallas@ole.me", "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"));
        comments.add(new Comment(2, 8, "et omnis dolorem", "Mallory_Kunze@marie.org", "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"));
        comments.add(new Comment(3, 13, "aut inventore non pariatur sit vitae voluptatem sapiente", "Kariane@jadyn.tv", "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"));
        comments.add(new Comment(3, 14, "et officiis id praesentium hic aut ipsa dolorem repudiandae", "Nathan@solon.io", "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"));
        comments.add(new Comment(3, 15, "debitis magnam hic odit aut ullam nostrum tenetur", "Maynard.Hodkiewicz@roberta.com", "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"));
        // System.out.println(comments);



        // Створимо список постів і наповнимо його. Коментарі залишимо пустим масивом (new ArrayList<>()).
        List<Post> posts = new ArrayList<>();

        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto", new ArrayList<>()));
        posts.add(new Post(1, 2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla", new ArrayList<>()));
        posts.add(new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut", new ArrayList<>()));



                                // Проітерувати списки, і додати коментар з відповідним id до відповідного поста
        // Ітеруємо через кожен пост у списку 'posts'.
        for (Post post : posts) {
            // Ітеруємо через кожен коментар у списку 'comments'.
            for (Comment comment : comments) {
                // Перевіряємо, чи належить поточний коментар до поточного поста, порівнюючи їх id.
                if (comment.getPostId() == post.getId()) {
                    // Якщо коментар належить до поста, отримуємо список коментарів для цього поста (методом getComments())і додаємо до нього поточний коментар.
                    post.getComments().add(comment);
                }
            }
        }


        // Виведення інформації про всі пости
        for (Post post : posts) {
            System.out.println(post);
        }


    }
}