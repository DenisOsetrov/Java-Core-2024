package homeworks.homework_1;

import java.math.BigDecimal;

public class Car {
    private String model;
    private int power;
    private BigDecimal volumeEngine;
    private Boolean turbo;


    // Конструктор
    public Car(String model, int power, BigDecimal volumeEngine, Boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }


    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public BigDecimal getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(BigDecimal volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }


    // toString
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';
    }
}

