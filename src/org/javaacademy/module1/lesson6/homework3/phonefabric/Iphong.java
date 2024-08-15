package org.javaacademy.module1.lesson6.homework3.phonefabric;

public class Iphong extends PhoneFabric {
    Components componentsIphong = new Components(8, 1000, 1000,
                                        200, 60, 10);

    @Override
    void infoProcessor() {
        System.out.print(componentsIphong.getProcessor() + " ");
        super.infoProcessor();
        System.out.print(componentsIphong.getProcessor2() + " ");
        super.infoProcessor();
    }

    @Override
    void foto() {
        super.foto();
        System.out.println(" " + componentsIphong.getCamera() + " Mp");
    }
}
