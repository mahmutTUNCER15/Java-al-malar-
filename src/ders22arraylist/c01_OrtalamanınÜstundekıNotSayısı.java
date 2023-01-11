package ders22arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c01_OrtalamanınÜstundekıNotSayısı {
    public static void main(String[] args) {
        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den  buyuk bır sayı gırıp bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin
        List<Double>notlar=listeOlustur();
        System.out.println(notlar);

    }
    public static List<Double> listeOlustur() {

        List<Double> notlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Double girilenNot = (double)5;

        while (girilenNot<=100) {

            System.out.println("Lutfen listeye eklemek icin NOT giriniz" +
                    "\nBitirmek icin 100'den buyuk bır sayı yazın");
            girilenNot = scan.nextDouble();

            if (girilenNot<100) {
                notlar.add(girilenNot);
            }
        }
        return notlar;
    }
}