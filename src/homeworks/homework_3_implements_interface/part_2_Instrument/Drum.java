package homeworks.homework_3_implements_interface.part_2_Instrument;

import java.math.BigDecimal;

// Метод play() всередині класу має доступ до приватних полів цього класу і може використовувати їх безпосередньо.
//Коли ми створюємо екземпляри класів Guitar, Drum, Trumpet і викликаємо метод play(), цей метод вже знає,
// як виводити інформацію про об'єкт, використовуючи значення його полів.
//Геттери для доступу до полів не потрібні, оскільки метод play() вже визначений у класі, де ці поля оголошені.
public class Drum implements Instrument {
    private final BigDecimal size;


    // Конструктор класу
    public Drum (BigDecimal size) {
        this.size = size;
    }


    // Конструктор методу і його реалізація
    @Override
    public void play() {
        System.out.println(STR."Грає барабан з розміром: \{size} сантиметрів!");
    }
}
