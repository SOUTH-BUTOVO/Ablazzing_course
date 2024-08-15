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
}
