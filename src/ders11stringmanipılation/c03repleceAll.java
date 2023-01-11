package ders11stringmanipılation;

public class c03repleceAll {

    public static void main(String[] args) {

        String str= "J1ava2 G9uzel5dır8";
        // str dakı sayıalrı silip metnı java guzeldıre donusturelım.
        // str.replaceAll sadece bir harf veya char seguence yı degıl
        // genelleme ile soyleyebılecegımız ortak ozellıktekı tum karaktarlerı degıstırı

        System.out.println(str.replaceAll("\\d",""));

        System.out.println(str.replaceAll("\\D",""));

        String s1="ilk ürün fiyatı:1250 tl";
        String s2="ikinci ürün fiyatı:1500";
        //iki ürünün fiyatlarını tapolayn
        System.out.println(s1.replaceAll("//D",""));
        System.out.println(str.replaceAll("//D",""));
        System.out.println(s1+s2);
        //System.out.println(Integer.parseInt(s1+Integer(s2)));



    }

}
