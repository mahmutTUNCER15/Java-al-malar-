package ders27immutableClass_DateAndTime;

import java.time.LocalTime;

public class c05LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

        System.out.println(saat);

        LocalTime saat2=LocalTime.of(19,30,20);
        System.out.println(saat.compareTo(saat2));

        System.out.println(saat2.withNano(45565));
    }
}
