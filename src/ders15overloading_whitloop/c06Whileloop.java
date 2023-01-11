package ders15overloading_whitloop;

import java.util.Scanner;

public class c06Whileloop {
    public static void main(String[] args) {
        /*Soru : Kullanicidan  sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
         gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
    sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
         */
        Scanner scan=new Scanner(System.in);
        boolean sifreGecerlimi=false;
        String sifre="";


        while (sifreGecerlimi!=true);

        System.out.println("lutfen sifrenizi girin");
            sifre=scan.nextLine();
            int bayrak=0;

            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            System.out.println("sifrenin ilk karakteri kucuk harf olmalı");

        }
        if (!(sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("sifrenın son karakteri sayı olmalı");
            bayrak++;
    }
        if (bayrak==0)
            sifreGecerlimi=true;
        System.out.println("sifreniz basarı ile kaydedıldı");
    }

}
