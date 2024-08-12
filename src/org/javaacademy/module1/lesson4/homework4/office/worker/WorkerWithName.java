package org.javaacademy.module1.lesson4.homework4.office.worker;

public abstract class WorkerWithName {
    protected final String name;

    public WorkerWithName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
