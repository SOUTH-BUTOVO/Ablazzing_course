package org.javaacademy.module1.lesson6.homework3.phonefabric.phone;

import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Camera;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Case;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Cpu;

import java.util.Arrays;

public abstract class Phone {
    protected Camera camera;
    protected Case phoneCase;
    protected Cpu[] cpuArray;

    public Phone(Camera camera, Case phoneCase, Cpu[] cpuArray) {
        this.camera = camera;
        this.phoneCase = phoneCase;
        this.cpuArray = cpuArray;
    }

    public void makePhoto() {
        camera.makePhoto();
    }

    protected void printInfo(String modelName) {
        System.out.printf("%s{" +
                "cpuArray=" + Arrays.toString(cpuArray) +
                ", phoneCase=" + phoneCase +
                ", camera=" + camera +
                '}' + "\n", modelName);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "camera=" + camera +
                ", phoneCase=" + phoneCase +
                ", cpuArray=" + Arrays.toString(cpuArray) +
                '}';
    }
}
