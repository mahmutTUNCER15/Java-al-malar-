package ders1practis101022;

import java.util.Scanner;

public class c2scanner_ifstatement {
    public static void main(String[] args) {
        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner san=new Scanner(System.in);

        double vize, finalnotu, devam;
        System.out.print("vize notunuzu giriniz:\n");
        vize=san.nextDouble();
        System.out.println("final notunuzu girin:\n");
        finalnotu=san.nextDouble();
        System.out.println("devam notunuzu girin:");
        devam=san.nextDouble();

        double ort= (vize*0.1)+ (finalnotu*0.8)+(devam*0.1);
        if (ort>100 || ort<0){
            System.out.println("Yanlis giris yaptiniz, lutfen gecerli degerler giriniz!!!!!");
        }else if(ort>=70){
            System.out.println("Ortalamaniz = " + ort +" Tebrikler, caliskan Nesrin");}
        else if(ort>=60){
            System.out.println("Ortalamaniz = " + ort +" Sartli gectiniz, Agno'nuz 1.8'in uzerinde ise gecmis olursunuz");
        }else System.out.println("Ortalamaniz = " + ort +" Bu sefer olmadi seneye Mujgan :'(");





    }


}
