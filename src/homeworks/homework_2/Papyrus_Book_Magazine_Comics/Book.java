package homeworks.homework_2.Papyrus_Book_Magazine_Comics;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Book extends Papyrus {
    private int year;
    private String author;

    public Book(String country, int year, String author) {
        super(country);
        this.year = year;
        this.author = author;
    }
}
