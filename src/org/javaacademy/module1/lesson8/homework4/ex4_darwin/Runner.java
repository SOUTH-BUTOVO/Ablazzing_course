package org.javaacademy.module1.lesson8.homework4.ex4_darwin;

//Создать следующую структуру
//             Живое
//       /             \
//    Хищник             Травоядное
//    /   \              /         \
// волк   тигр       кролик        слон
//
//Живое - обладает свойством жив/мертв, вес. Умеет умирать - переход в состояние мертв.
//
//Хищник
//Умеет нападать на живое. В случае если вес жертвы больше хищника, то хищник погибает,
//иначе вес хищника увеличивается на треть веса жертвы и жертва погибает.
//Может нападать только при живом состоянии, иначе выпадает ошибка "Животное не может нападать".
//
//Травоядное - умеет бегать (не определено как).
// Но все травоядные могут бегать только в состоянии живое.
//Иначе выдает ошибку - "Животное не может бегать".
//
//Тигр умеет нападать на живое, но за счет ловкости может съесть жертву весом до двух раз больше него.
//Остальные условия такие же как при нападении хищника.
//
//Волк - не обладает уникальными свойствами или действиями.
//Кролик - умеет бегать (печать "кролик быстро бежит")
//Слон - умеет бегать (печать "слон медленно бежит")
//
//Создать отдельный пакет и Runner. В Runner:
//1.Создать Тигра(300 кг), Волка(50 кг), кролика(2 кг), Слона (2000 кг)
//2.Кролик должен пробежать
//3.Волк ест кролика
//4.Тигр ест волка
//5.Тигр пытается съесть слона
//6.Слон пробегает
//7.Вызвать у съеденного кролика бег, сделать так, чтобы программа НЕ закончилась с ошибкой,
//а распечатала текст ошибки.

import org.javaacademy.module1.lesson8.homework4.ex4_darwin.animal.Elephant;
import org.javaacademy.module1.lesson8.homework4.ex4_darwin.animal.Rabbit;
import org.javaacademy.module1.lesson8.homework4.ex4_darwin.animal.Tiger;
import org.javaacademy.module1.lesson8.homework4.ex4_darwin.animal.Wolf;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигр", 300, true);
        Wolf wolf = new Wolf("Волк", 50, true);
        Rabbit rabbit = new Rabbit("Кролик", 2, true);
        Elephant elephant = new Elephant("Слон", 2_000, true);
        Live[] animals = {rabbit, wolf, tiger, elephant};

        rabbit.run();
        elephant.run();
        System.out.println("-----------");

        try {
            tiger.attack(animals);
            tiger.attack(animals);
        } catch (MyLiveException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("-----------");

        tiger.setAlive(true);
        wolf.setAlive(true);
        rabbit.setAlive(true);
        try {
            wolf.attack(animals);
            wolf.attack(animals);
        } catch (MyLiveException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("-----------");

        // Кролик съеден, но вызываем бег
        try {
            rabbit.run();
        } catch (MyLiveException e) {
            System.err.println(e.getMessage());
        }
    }
}
