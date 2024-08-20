package org.javaacademy.module1.lesson8.homework4.ex2_fly;

//1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
// атрибут самолета: countPassengers.
//2. Создать интерфейс, который объединяет эти два класса.
//3. Имплементировать его в двух классах
//4. Реализовать метод летать:
// Для утки:
// Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
// иначе печатать на экран "утка летит"
// Для самолета:
// Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
// Иначе печать "самолет летит"
//5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
//6. Вызвать у них метод летать
// Перехватить исключения: вывести на экран текст
// Ожидание (то что будет в консоли):
// утка летит
// Ошибка: утка ранена
// самолет летит
// Ошибка: пассажиров в самолете меньше 0

public class Runner {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        Flyable[] flyables = {duck1, duck2, airplane1, airplane2};
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println();
            }
        }
    }
}
