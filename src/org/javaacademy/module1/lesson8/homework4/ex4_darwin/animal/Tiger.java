package org.javaacademy.module1.lesson8.homework4.ex4_darwin.animal;

import org.javaacademy.module1.lesson8.homework4.ex4_darwin.Live;
import org.javaacademy.module1.lesson8.homework4.ex4_darwin.MyLiveException;
import org.javaacademy.module1.lesson8.homework4.ex4_darwin.Predator;

public class Tiger extends Predator {

    public Tiger(String typeName, double weight, boolean alive) {
        super(typeName, weight, alive);
    }

    @Override
    public void attack(Live[] animal) throws MyLiveException {
        setWeight(getWeight() * 2); // Ловкость тигра х2

        for (int i = 0; i < animal.length; i++) {
            // Проверка на возможность сделать атаку
            if (!isAlive()) {
                throw new MyLiveException(getTypeName() + " мёртвый и не может охотиться");
            }
            if (getClass() != animal[i].getClass() &&
                getWeight() >= animal[i].getWeight()) {
                // Действия при успешной атаке
                System.out.print(getTypeName());
                System.out.print(" ест ");
                System.out.println(animal[i].getTypeName());
                animal[i].setAlive(false); // жертва умерла
                setWeight(getWeight() + animal[i].getWeight() * 0.3); // увеличение веса хищника
                // Действия при проваленной атаке
            } else if (getClass() != animal[i].getClass() && animal[i].isAlive()) {
                System.out.print(animal[i].getTypeName());
                System.out.println(" убежал от атаки");
                System.out.print(getTypeName());
                System.out.println(" погиб при атаке на " + animal[i].getTypeName());
                setAlive(false); // хищник умер
            }
        }
    }
}



