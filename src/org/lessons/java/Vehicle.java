package org.lessons.java;

public abstract class Vehicle {
    public String plate;
    public int registrationYear;

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", registrationYear=" + registrationYear +
                '}';
    }
}
