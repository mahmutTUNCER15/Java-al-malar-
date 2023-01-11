package ders35Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class c04eTryCatch {
    public static void main(String[] args) {
        //kullanıcıdan ıstedıgı kadar sayı gırmesını ısteyıp gırılen sayıları toplayın
        //kullanıcının işlemı bıtırmek ıcın q basmasını isteyın
        //q ya basıldıgında toplam kac sayı gırdıgını
        //ve bu sayıların toplamının kac oldugunu yazdırın

        Scanner scan=new Scanner(System.in);
        int gırılenSayı=0;
        int sayılarınToplamı=0;
        int sayac=0;
        boolean devam=true;

        while (devam){
            System.out.println("toplamak uzere sayı gırınız.\nBıtırmek ıcın q ya basınız");

            try {
                gırılenSayı= (int) scan.nextDouble();
                sayılarınToplamı+=gırılenSayı;
                sayac++;

            } catch (InputMismatchException e) {

            String str=scan.next();
            if (str.equalsIgnoreCase("q")){
                break;
            }

            }

        }
        System.out.println("gırılen"+sayac+"sadet sayının toplmı"+sayılarınToplamı);
    }
}
