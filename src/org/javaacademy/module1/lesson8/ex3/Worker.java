package org.javaacademy.module1.lesson8.ex3;

// Лесоруб
public class Worker {
    private Axe axe;
    private boolean isDrunk;

    public Worker(Axe axe) {
        this.axe = axe;
    }

    // Рубить
    void chop() throws AxeIsBrokenException, WorkerIsDrunkException {
        if (axe.isBroken()) {
            throw new AxeIsBrokenException("Топор сломан");
        }
        if (isDrunk) {
            throw new WorkerIsDrunkException("Лесоруб пьяный и не может рубить деревья");
        }
        System.out.println("Дерево срублено");
    }

    void drink() {
        isDrunk = true;
    }
}
