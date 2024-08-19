package org.javaacademy.module1.lesson6.homework3.city;

import java.util.Arrays;

public final class City {
    private final String nameCity;
    private final House[] arrHouse;

    public City(String nameCity, House[] arrHouse) {
        this.nameCity = nameCity;
        this.arrHouse = arrHouse;
    }

    @Override
    public String toString() {
        return "Имя города: " + nameCity +
               ", все дома: " + Arrays.toString(arrHouse);
    }

    public String getNameCity() {
        return nameCity;
    }

    public House[] getArrHouse() {
        try {
            House[] housesCopy = new House[arrHouse.length];
            for (int i = 0; i < arrHouse.length; i++) {
                House house = arrHouse[i];
                House houseCopy = (House) house.clone();
                housesCopy[i] = houseCopy;
            }
            return housesCopy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
