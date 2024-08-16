package org.javaacademy.module1.lesson7.shoes_factory_ex1;

public class Factory {
    //private static final String[] COUNTRIES = {"Russia", "France"};
    private CountryEnum countryFrom;

    public Factory(CountryEnum countryFrom) {
        this.countryFrom = countryFrom;
    }

    @Override
    public String toString() {
        return "Factory {" + "countryFrom='" + countryFrom.getName() + '\'' + '}';
    }
}
