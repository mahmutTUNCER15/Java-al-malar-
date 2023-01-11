package ders29strıngBuilder_AccesModifler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c01DateTimeFormatır {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();

        System.out.println(zaman);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/mm/yyyy");

        System.out.println(zaman.format(dtf1));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMM:YY");

        System.out.println(zaman.format(dtf2));

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("DDD.d.MMM.YYYY.EEEE.HH.mm");

        System.out.println(zaman.format(dtf3));

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh.mm a");

        System.out.println(zaman.format(dtf4));
/*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar
         */


    }
}
