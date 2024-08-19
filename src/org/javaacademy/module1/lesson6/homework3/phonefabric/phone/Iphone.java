package org.javaacademy.module1.lesson6.homework3.phonefabric.phone;

import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Camera;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Case;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Cpu;

import java.util.Arrays;

public class Iphone extends Phone {
    private static final String MODEL_NAME = "Iphone";

    public Iphone(Camera camera, Case phoneCase, Cpu cpu1, Cpu cpu2) {
        super(camera, phoneCase, new Cpu[]{cpu1, cpu2});
        for (Cpu cpu : this.cpuArray) {
            if (cpu == null) {
                throw new RuntimeException("Не может быть процессора null");
            }
        }
    }

    public void printInfoCpu() {
        System.out.println("Информация о процессорах :" + Arrays.toString(cpuArray) + "mHz\n");
    }

    public void printInfo() {
        super.printInfo(MODEL_NAME);
    }
}
