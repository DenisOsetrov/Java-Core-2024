package homeworks.homework_3_implements_interface.part_2_Instrument;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Створення масиву інструментів
        Instrument[] instruments = {
                new Drum(new BigDecimal("150")),
                new Guitar(7),
                new Trumpet(8.2)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }

        // Створення списку інструментів
        List<Instrument> instruments1 = new ArrayList<>();
        instruments1.add(new Drum(new BigDecimal("300")));
        instruments1.add(new Guitar(12));
        instruments1.add(new Trumpet(6.5));

        for (Instrument instrument: instruments1) {
            instrument.play();
        }
    }
}
