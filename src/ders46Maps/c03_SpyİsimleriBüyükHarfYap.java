package ders46Maps;

import ders44Maps.MapDepo;

import java.util.Map;

public class c03_SpyİsimleriBüyükHarfYap {
    public static void main(String[] args) {
        //ogrencı map ındekı soy ısımlerı buyuk harfe cevırıp
        // map ıbıze  donduren bır method olusturun

        Map<Integer,String>ogrenciMapi= MapDepo.ornekMapOlustur();

        ogrenciMapi.put(109,"Adem-demir-11-D-Soz");

        ogrenciMapi=MapDepo.soyİsimleriBuyukHarfYap(ogrenciMapi);

        System.out.println(ogrenciMapi);
    }
}
