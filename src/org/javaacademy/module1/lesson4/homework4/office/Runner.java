package org.javaacademy.module1.lesson4.homework4.office;

public class Runner {
    public static void main(String[] args) {
        Office boss = new Office("Boss", "Петр Николаевич", " быстрее!");
        Office security = new Office("Security", "Петрович",
                                     "прошу выдать мне аванс!");
        Office manager = new Office("Manager", "Володя",
                                    "я ничего не успеваю, помогите!");
        Office secretary = new Office("Secretary",
                                      boss.getName() +" не волнуйтесь, " +
                                      manager.getName() + " все успеет. " +
                                      security.getName() + " - подождите!");

        boss.setVoice(manager.getName() + boss.getVoice());

        Office.workingDay(boss, manager, secretary, security);
    }
}
