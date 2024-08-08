package org.javaacademy.module1.lesson4.homework4.office;

public class Office {
    private String post;
    private String name;
    private String voice;

    public Office(String post, String voice) {
        this.post = post;
        this.voice = voice;
    }

    public Office(String post, String name, String voice) {
        this.post = post;
        this.name = name;
        this.voice = voice;
    }

    static void workingDay(Office boss, Office manager,
                           Office secretary, Office security) {
        System.out.println("Начинается рабочий день:\n ------");
        System.out.println(boss.getPost() + " - " + boss.getVoice());
        System.out.println(manager.getPost() + " " + manager.getName() + " - " +
                           manager.getVoice());
        System.out.println(security.getPost() + " " + security.getName() + " - " +
                           security.getVoice());
        System.out.println(secretary.getPost() + " - " + secretary.getVoice());
    }

    public String getPost() {
        return post;
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
