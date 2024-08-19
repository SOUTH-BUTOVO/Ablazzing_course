package org.javaacademy.module1.lesson6.homework3.phonefabric.factory;

import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Camera;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Case;
import org.javaacademy.module1.lesson6.homework3.phonefabric.component.Cpu;
import org.javaacademy.module1.lesson6.homework3.phonefabric.phone.Samsung;

public class SamsungFactory {
    private static final int COUNT_MEGAPIXELS = 16;
    private static final int CPU_MHZ = 1500;
    private static final int CASE_LENGTH = 200;
    private static final int CASE_WIDTH = 60;
    private static final int CASE_THICKNESS = 15;
    //private static final Camera camera = new Camera(COUNT_MEGAPIXELS);

    public static Samsung createPhone() {
        Camera camera = new Camera(COUNT_MEGAPIXELS);
        Cpu cpu = new Cpu(CPU_MHZ);
        Case samsungCase = new Case(CASE_LENGTH, CASE_WIDTH, CASE_THICKNESS);
        return new Samsung(camera, samsungCase, cpu);
    }
}
