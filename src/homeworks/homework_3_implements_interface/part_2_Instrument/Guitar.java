package homeworks.homework_3_implements_interface.part_2_Instrument;


public class Guitar implements Instrument{
    private final int numberOfStrings;

    // конструктор класу
    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    // конструктор методу
    @Override
    public void play() {
        System.out.println("Грає гітара з кількістю струн: " + numberOfStrings + " шт.!");
    }

            // або:
//    public void play() {
        // System.out.println(STR."\{this.getClass().getSimpleName()} play with \{this.toString()}");
        // this.getClass().getSimpleName() повертає просте ім'я класу.
        // this.toString() повертає рядок з усіма полями класу, автоматично згенерований Lombok в класі!!!
//    }
}
