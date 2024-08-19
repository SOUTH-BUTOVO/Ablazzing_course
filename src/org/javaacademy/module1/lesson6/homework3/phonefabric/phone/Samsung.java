package org.javaacademy.module1.lesson6.homework3.phonefabric.phone;

import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Camera;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Case;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Cpu;

import java.util.Arrays;

public class Samsung extends Phone {
    private static final String MODEL_NAME = "Samsung";

    public Samsung(Camera camera, Case phoneCase, Cpu cpu) {
        super(camera, phoneCase, new Cpu[]{cpu});
    }

    public void printInfo() {
        super.printInfo(MODEL_NAME);
    }
}
