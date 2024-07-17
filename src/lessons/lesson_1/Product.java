package lessons.lesson_1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {

    private String name; // Назва продукту
    private BigDecimal price; // Ціна продукту
    private String description; // Опис продукту
    private int quantity; // Кількість продукту
    private ArrayList<String> reviews = new ArrayList<>(); // Список відгуків про продукт.



    // Створення конструкторів, вибираючи потрібні поля
    // Викликати Alt+Insert

        // Конструктор для створення продукту з назвою і ціною
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    // Конструктор для створення продукту з назвою, ціною, описом і кількістю
    public Product(String name, BigDecimal price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }




    // Геттери для доступу до полів. 1 метод на 1 поле!
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }



    // Сеттери для зміни значень полів
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


// Створюємо методи додавання і видалення відгуків (reviews)

        // Метод для додавання відгуку
    public void addReview(String review) {
        reviews.add(review);
    }

    // Метод для видалення відгуку
    public void removeReview(String review) {
        reviews.remove(review);
    }



    // метод toString

//    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", description='" + description + '\'' +
//                ", quantity=" + quantity +
//                ", reviews=" + reviews +
//                '}';
//    }
}

