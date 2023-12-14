package org.lessons.java;

public class Motorbike extends Vehicle {
    private boolean hasEasel;

    public Motorbike(String plate, int registrationYear, boolean hasEasel) throws IllegalArgumentException {
        super(plate, registrationYear);
        this.hasEasel = hasEasel;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "hasEasel=" + hasEasel +
                ", plate='" + plate + '\'' +
                ", registrationYear=" + registrationYear +
                '}';
    }
}
