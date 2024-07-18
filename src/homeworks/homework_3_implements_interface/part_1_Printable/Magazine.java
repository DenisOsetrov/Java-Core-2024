package homeworks.homework_3_implements_interface.part_1_Printable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Magazine implements Printable{
    private String title;
    private String genre;
    private int pageCount;


    // Конструктор для методу інтерфейсу

    @Override
    public void print() {
        System.out.println("Інформація про журнал: " +
                "назва - " + getTitle() +
                ", жанр - " + getGenre() +
                ", кількість сторінок - " + getPageCount() + ".");
    }
}
