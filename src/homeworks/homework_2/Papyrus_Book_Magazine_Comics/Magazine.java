package homeworks.homework_2.Papyrus_Book_Magazine_Comics;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Magazine extends Book {
    private  String genre;

    public Magazine(String country, int year, String author, String genre) {
        super(country, year, author);
        this.genre = genre;
    }
}
