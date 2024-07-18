package homeworks.homework_3_implements_interface.part_1_Printable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Book implements Printable{
    private String title;
    private String author;
    private int year;
    private int page;


    // Конструктор для методу інтерфейсу
    @Override
    public void print() {
        System.out.println("Короткі відомості про книгу: " +
                "назва книги - " + getTitle() +
                ", автор книги - " + getAuthor() +
                ", рік видання - " + getYear() +
                ", кількість сторінок - " + getPage() + ".");
    }
}
