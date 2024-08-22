package org.javaacademy.module1.lesson8.homework4.ex3_sound;

import org.javaacademy.module1.lesson8.homework4.ex3_sound.human.Builder;
import org.javaacademy.module1.lesson8.homework4.ex3_sound.human.Driver;
import org.javaacademy.module1.lesson8.homework4.ex3_sound.human.Human;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        Voiceable[] voiceables = {human, builder, driver, bird};
        for (Voiceable voiceable : voiceables) {
            System.out.println(voiceable.voice());
        }
    }
}
