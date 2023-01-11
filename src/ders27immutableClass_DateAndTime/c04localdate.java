package ders27immutableClass_DateAndTime;

import java.time.LocalDate;

public class c04localdate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.minusDays(100));

        System.out.println(tarih.minusDays(5).minusDays(3));

        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3));

        System.out.println(tarih.getMonthValue());

        System.out.println(tarih.getDayOfMonth());

        System.out.println(tarih.getMonth());

        System.out.println(tarih.getDayOfWeek());

        System.out.println(tarih.getDayOfYear());

        System.out.println(tarih.isLeapYear());

        System.out.println(tarih.withYear(2000).isLeapYear());

        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));

        System.out.println(tarih.lengthOfYear());

        System.out.println(tarih.withYear(2020).lengthOfYear());
        System.out.println(tarih.withYear(1984).withMonth(10).withDayOfMonth(15).getDayOfWeek());

        LocalDate date1=LocalDate.of(2011,11,11);

        LocalDate date2=LocalDate.of(20,11,11);

        System.out.println(date2.isBefore(date1));

        System.out.println(date2.isBefore(date1));

        System.out.println(tarih.equals(date1));
    }
}
