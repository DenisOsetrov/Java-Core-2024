package homeworks.homework_1;


public class Dog {
    private String name;
    private int age;
    private String breedOfDog;


    // Конструктор

    public Dog(String name, int age, String breedOfDog) {
        this.name = name;
        this.age = age;
        this.breedOfDog = breedOfDog;
    }


    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
    }


    // toString

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breedOfDog='" + breedOfDog + '\'' +
                '}';
    }
}