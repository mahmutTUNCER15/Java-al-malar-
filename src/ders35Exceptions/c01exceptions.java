package ders35Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class c01exceptions {
    public static void main(String[] args) {
        //kullanıcıdan bır tam sayı alın
        //ve sayının karesını yazdırın
        //kullnıcı ondalık ssayı gırerse kullanıcıdan uyarı yazdırıp
        //tekrar sayı isteyin bır method olusturun
sayıAlkaresınıYazdır();
    }
    public static void sayıAlkaresınıYazdır(){
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bır tam sayı gırınıx");

        int gırılenSayı= 0;

        try {
/*
eger ondalıklı sayı gırılırse 26.satırexceptıon verecek ve
catch bloguna kadar olan dıger kodlar calısmayacak
catch blogu hata yakaladıgında ne yapmasını ıstedıgını soyledıgımız bolumdur
hata olmaz ısee catch blogu devreye gırmez ve kod normal calısmaya devam eder
 */
            gırılenSayı = scan.nextInt();

            System.out.println("gırdıgınız sayının karesı");

            System.out.println(gırılenSayı*gırılenSayı);

        } catch (InputMismatchException e) {

            System.out.println("sana tan sayı degerı gır");

            sayıAlkaresınıYazdır();

        }


    }
}
