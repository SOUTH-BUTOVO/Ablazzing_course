package org.javaacademy.module1.lesson6.homework3.phonefabric.component;

public class Case {
    private int length; // длинна
    private int width; // ширина
    private int thickness; // толщина

    public Case(int length, int width, int thickness) {
        this.length = length;
        this.width = width;
        this.thickness = thickness;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return "Case{" +
                "length=" + length +
                ", width=" + width +
                ", thickness=" + thickness +
                '}';
    }
}
