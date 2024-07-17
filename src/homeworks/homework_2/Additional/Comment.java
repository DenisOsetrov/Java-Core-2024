package homeworks.homework_2.Additional;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
