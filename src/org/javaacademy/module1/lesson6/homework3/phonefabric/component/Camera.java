package org.javaacademy.module1.lesson6.homework3.phonefabric.component;

public class Camera {
    private int countMegaPixels;

    public Camera(int countMegaPixels) {
        this.countMegaPixels = countMegaPixels;
    }

    public void makePhoto() {
        System.out.println("Сделано фото " + this.countMegaPixels + "Mp");
    }

    public int getCountMegaPixels() {
        return countMegaPixels;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "countMegaPixels=" + countMegaPixels +
                '}';
    }
}
