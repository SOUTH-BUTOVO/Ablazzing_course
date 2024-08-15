package org.javaacademy.module1.lesson6.homework3.city;

//3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
// эти изменения не затронут дом находящийся внутри города.
// Т.е. результат должен соответствовать псевдокоду ниже:
//
//[] - квадратные скобки - массив
//{} - объект
// City city = new City([{new House('Lenina', 1)}], "Мурманск");
// System.out.println(city);
//-- City{[House{street: Lenina, house: 1}], name: "Мурманск"}
//House house = city.getHouses()[0];
//house.setStreet('Kotova');
//System.out.println(house);
//-- House{street: Kotova, house: 1}
//System.out.println(city);
//-- City{House{street: Lenina, house: 1}}

public class Runner {
    public static void main(String[] args) {
        House house1 = new House("Фруктовая", 12);
        House house2 = new House("Цветочная", 18);
        City city = new City("Москва", new House[]{house1, house2});

        house1.setStreetName("Ленина");
        System.out.println(house1.getStreetName());

        System.out.println(city);
    }
}
