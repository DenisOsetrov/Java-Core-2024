package homeworks.homework_4_collections.part_1_users_sort;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
    }
