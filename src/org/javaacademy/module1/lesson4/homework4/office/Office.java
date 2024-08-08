package org.javaacademy.module1.lesson4.homework4.office;

//Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
//Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
//Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
//"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
//Охранник обладает именем. Просит выдать ему аванс.
//В офисе есть метод рабочий день:
//--Босс начинает подгонять менеджера
//--Менеджер кричит
//--Охранник просит аванс
//--Секретарша всех успокаивает, и просит подождать

public class Office {
    String post;
    String name;
    String voice;

    public Office() {
    }

    public Office(String post, String voice) {
        this.post = post;
        this.voice = voice;
    }

    public Office(String post, String name, String voice) {
        this.post = post;
        this.name = name;
        this.voice = voice;
    }

    void workingDay(Office boss, Office manager,
                           Office secretary, Office security) {
        System.out.println("Начинается рабочий день:");
        System.out.println(boss.getVoice());
        System.out.println(manager.getVoice());
        System.out.println(security.getVoice());
        System.out.println(secretary.getVoice());
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
