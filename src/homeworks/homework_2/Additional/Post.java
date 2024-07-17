package homeworks.homework_2.Additional;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> comments;
}
