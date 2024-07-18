package homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation;

import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor  // дає змогу будувати об'єкт з 2 полями: weight і screenExtension.
@ToString(includeFieldNames = true, callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Ultrabook extends Laptop{

    private double weight;
    private String screenExtension;

    // Конструктор для двох класів


    public Ultrabook(BigDecimal price, String company, String processor, int core, int ram, int ssd, boolean video,
                     String model, int inch, int batteryVolume, double weight, String screenExtension) {
        super(price, company, processor, core, ram, ssd, video, model, inch, batteryVolume);

        this.weight = weight;
        this.screenExtension = screenExtension;
    }
}
