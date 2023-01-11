package ders46Maps;

import ders44Maps.MapDepo;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class c02_EntrySet {
    public static void main(String[] args) {
        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

        Map<Integer,String>ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-demir-11-D-Soz");
        //bu formatta strıgler olusturup treeset e atayan ve bu setı bıze donduren bır method yapınız

        Set<String>sıralıOgrenciListesi=MapDepo.sıralıOgrenciListesiOluştur(ogrenciMapi);

        System.out.println(sıralıOgrenciListesi);
        /*
        [MF, H,Ali,Can,101,
         MF, H,Ayse,Can,104,
         Soz, D,Adem,demir,109,
         Soz, K,Fatma,Han,106,
         Soz, M,Veli,Cem,102,
         TM, H,Ali,Cem,103,
         TM, M,Ayse,Cem,105]
         */
    }
}
