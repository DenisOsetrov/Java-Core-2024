package homeworks.homework_3_implements_interface.part_2_Instrument;

// Метод play() всередині класу має доступ до приватних полів цього класу і може використовувати їх безпосередньо.
//Коли ми створюємо екземпляри класів Guitar, Drum, Trumpet і викликаємо метод play(), цей метод вже знає,
// як виводити інформацію про об'єкт, використовуючи значення його полів.
//Геттери для доступу до полів не потрібні, оскільки метод play() вже визначений у класі, де ці поля оголошені.


public class Trumpet implements Instrument {
    private final double diameter;


    // Конструктор класу
    public Trumpet(double diameter) {
        this.diameter = diameter;
    }


    // Конструктор методу інтерфейсу


    @Override
    public void play() {
        System.out.println(STR."Грає труба діаметром: \{diameter} дюймів!");
    }
}
