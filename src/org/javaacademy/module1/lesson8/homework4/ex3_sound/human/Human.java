package org.javaacademy.module1.lesson8.homework4.ex3_sound.human;

import org.javaacademy.module1.lesson8.homework4.ex3_sound.Voiceable;

public class Human implements Voiceable {
    @Override
    public String voice() {
        return "Я человек.";
    }
}
