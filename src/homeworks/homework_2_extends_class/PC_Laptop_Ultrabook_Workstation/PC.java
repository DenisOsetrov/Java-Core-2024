package homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true)

public class PC {

    private BigDecimal price;
    private String company;
    private String processor;
    private int core;
    private int ram;
    private int ssd;
    private boolean video;

}
