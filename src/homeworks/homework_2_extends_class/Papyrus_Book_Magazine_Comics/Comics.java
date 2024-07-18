package homeworks.homework_2_extends_class.Papyrus_Book_Magazine_Comics;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Comics extends Book {
    private String heroes;
    private int season;

    public Comics(String country, int year, String author, String heroes, int season) {
        super(country, year, author);
        this.heroes = heroes;
        this.season = season;
    }
}
