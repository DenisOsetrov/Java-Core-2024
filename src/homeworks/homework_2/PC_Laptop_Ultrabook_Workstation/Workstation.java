package homeworks.homework_2.PC_Laptop_Ultrabook_Workstation;

import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Workstation extends Laptop {
    private int videoCore;
    private boolean motherboard;

    public Workstation(BigDecimal price, String company, String processor, int core, int ram, int ssd, boolean video, String model, int inch, int batteryVolume, int videoCore, boolean motherboard) {
        super(price, company, processor, core, ram, ssd, video, model, inch, batteryVolume);
        this.videoCore = videoCore;
        this.motherboard = motherboard;
    }
}
