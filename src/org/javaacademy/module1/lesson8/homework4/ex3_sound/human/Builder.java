package org.javaacademy.module1.lesson8.homework4.ex3_sound.human;

public class Builder extends Human {
    @Override
    public String voice() {
        return "Я строитель." + super.voice();
    }
}
