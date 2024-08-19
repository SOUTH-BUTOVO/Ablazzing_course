package org.javaacademy.module1.lesson6.homework3.phonefabric;

import org.javaacademy.module1.lesson6.homework3.phonefabric.factory.IphoneFactory;
import org.javaacademy.module1.lesson6.homework3.phonefabric.factory.SamsungFactory;
import org.javaacademy.module1.lesson6.homework3.phonefabric.phone.Iphone;
import org.javaacademy.module1.lesson6.homework3.phonefabric.phone.Samsung;

public class Runner {
    public static void main(String[] args) {
        Iphone iphone = IphoneFactory.createPhone();
        Samsung samsung = SamsungFactory.createPhone();

        iphone.printInfo();
        samsung.printInfo();
    }
}
