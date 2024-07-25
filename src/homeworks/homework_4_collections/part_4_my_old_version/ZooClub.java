package homeworks.homework_4_collections.part_4_my_old_version;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor

public class ZooClub {
    private Map<Person, List<Pet>> club;
}
