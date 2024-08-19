package org.javaacademy.module1.lesson6.homework3.phonefabric.component;

public class Cpu {
    private int mhz;

    public Cpu(int mhz) {
        this.mhz = mhz;
    }

    public int getMhz() {
        return mhz;
    }

    @Override
    public String toString() {
        return "Cpu " + mhz;
    }
}
