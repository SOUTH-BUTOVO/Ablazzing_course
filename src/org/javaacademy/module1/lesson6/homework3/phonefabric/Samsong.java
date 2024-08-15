package org.javaacademy.module1.lesson6.homework3.phonefabric;

public class Samsong extends PhoneFabric {
    Components componentsSamsong = new Components(16, 1500,
                          200, 60, 15);

    @Override
    void foto() {
        super.foto();
        System.out.println(" " + componentsSamsong.getCamera() + " Mp");
    }
}
