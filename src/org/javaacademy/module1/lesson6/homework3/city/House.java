package org.javaacademy.module1.lesson6.homework3.city;

public class House {
    private String streetName;
    private int houseNumber;

    public House(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "название улицы: " + streetName +
                ", номера дома: " + houseNumber;
    }
}
