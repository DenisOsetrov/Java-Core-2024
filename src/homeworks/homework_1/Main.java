package homeworks.homework_1;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static homeworks.homework_1.Genre.*;

public class Main {
    public static void main(String[] args) {


    // 1 Завдання!
    // Робота з класами Car,Dog,Book

        // Cars
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes E-Class", 400, new BigDecimal("3.5"), true));
        cars.add(new Car("Mercedes C-Class", 400, new BigDecimal("3.5"), true));
        cars.add(new Car("BMW X3", 500, new BigDecimal("3.0"), true));
        cars.add(new Car("BMW X5", 500, new BigDecimal("3.0"), true));
        cars.add(new Car("Audi A4", 188, new BigDecimal("2.0"), false));


        // Ітерація cars - (iter)
        for (Car car : cars) {
            System.out.println(car);
            // System.out.println("Model: " + car.getModel() + ", Power: " + car.getPower() + " HP, Volume Engine: " +
            // car.getVolumeEngine() + " L, Turbo: " + car.getTurbo());
            // System.out.println(STR."Model: \{car.getModel()}, Power: \{car.getPower()} HP, Volume Engine: \{car
            // .getVolumeEngine()} L, Turbo: \{car.getTurbo()}");
        }
        System.out.println("*************************************************************************");



        // Dogs
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Barsyk", 3, "Labrador"));
        dogs.add(new Dog("Djasy", 7, "Poodle"));
        dogs.add(new Dog("Villy", 2, "Beagle"));
        dogs.add(new Dog("Lusy", 4, "Bulldog"));
        dogs.add(new Dog("Boss", 5, "Labrador"));

        for (Dog dog : dogs) {
            System.out.println(dog);
//            System.out.println(STR."Name: \{dog.getName()}, Age: \{dog.getAge()}, Breed: \{dog.getBreedOfDog()}");
        }
        System.out.println("*************************************************************************");



        // Books
        List<Book> books = new ArrayList<>();
            // Використання List.of
        books.add(new Book("First", 200, List.of("John Doe", "Jane Smith"), DRAMA));
            // Використання Arrays.asList
        books.add(new Book("Second", 300, Arrays.asList("John Doe", "Jane Smith"), DRAMA));
            // Використання new ArrayList<>() з додаванням елементів
        List<String> javaAuthors = new ArrayList<>();
        javaAuthors.add("Joshua Bloch");
        javaAuthors.add("Bloch Joshua ");
        books.add(new Book("Third", 360, javaAuthors, Genre.BIOGRAPHY));
            // Використання масиву з ініціалізацією
        String[] concurrencyAuthors = {"Brian Goetz", "Piter Si"};
        books.add(new Book("Fourth", 380, Arrays.asList(concurrencyAuthors), Genre.HISTORY));
            // Використання ArrayList з ініціалізацією
        List<String> cleanCodeAuthors = new ArrayList<>(List.of("Robert C.", "Martin O."));
        books.add(new Book("Clean Code", 464, cleanCodeAuthors, Genre.MYSTERY));


        for (Book book : books) {
            System.out.println(book);
//            System.out.println(STR."Title: \{book.getTitle()}, Pages: \{book.getPages()}, Authors: \{book.getAuthors()}, Genre: \{book.getGenre()}");
        }

        System.out.println("*************************************************************************");



        // 2 Завдання!
        // Робота з класами Post i Comment

        // Post
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "Title post 1", "Body post 1"));
        posts.add(new Post(1, 2, "Title post 2", "Body post 2"));
        posts.add(new Post(2, 1, "Title post 3", "Body post 3"));
        posts.add(new Post(2, 2, "Title post 4", "Body post 4"));
        posts.add(new Post(3, 1, "Title post 5", "Body post 5"));

        // Ітерація та виведення в консоль об'єктів класу Post
        for (Post post : posts) {
            System.out.println(post);
//            System.out.println(STR."UserId: \{post.getUserId()}, Id: \{post.getId()}, Title: \{post.getTitle()}, Body: \{post.getBody()}");
        }

        System.out.println("*************************************************************************");



        // Comment
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "Super!", "user1@egmail.com", "Comment body text 1"));
        comments.add(new Comment(1, 2, "Great!", "user2@egmail.com", "Comment body text 2"));
        comments.add(new Comment(1, 3, "Belissimo!", "user3@egmail.com", "Comment body 3"));
        comments.add(new Comment(1, 4, "Wow!", "user4@egmail.com", "Comment body text 4"));
        comments.add(new Comment(1, 5, "Yes!", "user5@egmail.com", "Comment body text 5"));

        // Ітерація та виведення в консоль об'єктів класу Comment
        for (Comment comment : comments) {
            System.out.println(comment);
//            System.out.println(STR."PostId: \{comment.getPostId()}, Id: \{comment.getId()}, Name: \{comment.getName()}, Email: \{comment.getEmail()}, Body: \{comment.getBody()}");
        }

        System.out.println("*************************************************************************");

//        System.out.println(dogs);
//        System.out.println(books);
//        System.out.println(cars);
//        System.out.println(post);
//        System.out.println(comments);
    }
}
