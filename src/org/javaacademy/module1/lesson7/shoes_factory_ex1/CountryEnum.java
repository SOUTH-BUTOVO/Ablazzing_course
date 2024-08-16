package org.javaacademy.module1.lesson7.shoes_factory_ex1;

public enum CountryEnum {
    RUSSIA("Россия", 150_000_000),
    FRANCE("Франция", 70_000_000),
    BRAZIL("Бразилия", 80_000_000);

    private String name;
    private int countPeople;

    CountryEnum(String name, int countPeople) {
        this.name = name;
        this.countPeople = countPeople;
    }

    @Override
    public String toString() {
        return "CountryEnum{" +
                "name='" + name + '\'' +
                ", countPeople=" + countPeople +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCountPeople() {
        return countPeople;
    }
}
