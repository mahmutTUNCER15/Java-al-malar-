package ders09_string;

import java.util.Locale;

public class c07substring {
    public static void main(String[] args) {

        String str="Java gun gectikce güzelleşiyor";

        str.substring(5,8);
        System.out.println(str.substring(5,8));
        // 5. index en başlar (8-5) karakter yazdırır.
        // 5. index dahil (inclusive), 8 index harıc

        System.out.println(str.substring(9,17)); // gectikce

        System.out.println(str.substring(3,7)); // a gu
String isim = "Hüseyin";
// verilen ismi ilk harfi büyük kalanlar kucuk harf olarak kaydedın.

       // isim = isim.substring(0,1).toUpperCase()+
                isim = isim.substring(1).toUpperCase();

// sadece 3.indexdekiharfi yazdır
        System.out.println(isim.substring(3,4));//e

        System.out.println("zor sorunun cevabı:"+ isim.substring(2,2));// hiçlik



    }
}
