package org.javaacademy.module1.lesson6.homework3.phonefabric.factory;

import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Camera;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Case;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Cpu;
import org.javaacademy.module1.lesson6.homework3.phonefabric.phone.Iphone;

public class IphoneFactory {
    private static final int COUNT_MEGAPIXELS = 8;
    private static final int CPU_MHZ = 1000;
    private static final int CASE_LENGTH = 200;
    private static final int CASE_WIDTH = 60;
    private static final int CASE_THICKNESS = 10;
    //private static final Camera camera = new Camera(COUNT_MEGAPIXELS);

    public static Iphone createPhone() {
        Camera camera = new Camera(COUNT_MEGAPIXELS);
        Cpu cpu1 = new Cpu(CPU_MHZ);
        Cpu cpu2 = new Cpu(CPU_MHZ);
        Case samsungCase = new Case(CASE_LENGTH, CASE_WIDTH, CASE_THICKNESS);
        return new Iphone(camera, samsungCase, cpu1, cpu2);
    }
}
