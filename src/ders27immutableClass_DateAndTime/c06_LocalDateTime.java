package ders27immutableClass_DateAndTime;

import java.time.LocalDateTime;

public class c06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();

        System.out.println(zaman);

        System.out.println(zaman.getDayOfYear());

        System.out.println(zaman.getHour());
    }
}
