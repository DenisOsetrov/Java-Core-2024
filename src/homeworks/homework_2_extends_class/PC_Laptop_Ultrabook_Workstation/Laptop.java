package homeworks.homework_2_extends_class.PC_Laptop_Ultrabook_Workstation;


import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true,callSuper = true )
@EqualsAndHashCode(callSuper = true)

public class Laptop extends PC {

    private String model;
    private int inch;
    private int batteryVolume;


    // Додамо перевірку до конструктора
    // Конструктор, що охоплює 2 класи
    public Laptop(
            BigDecimal price,
            String company,
            String processor,
            int core,
            int ram,
            int ssd,
            boolean video,
            String model,
            int inch,
            int batteryVolume) {

        // Виклик конструктора суперкласу
        super(price, company, processor, core, ram, ssd, video);

        // Перевірки апаратного забезпечення
        if (core <= 0 || ram <= 0 || ssd <= 0) {
            throw new IllegalArgumentException("Invalid hardware specifications");
        }

        // Ініціалізація полів підкласу
        this.model = model;
        this.inch = inch;
        this.batteryVolume = batteryVolume;
    }


}
