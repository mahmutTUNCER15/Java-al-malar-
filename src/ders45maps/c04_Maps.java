package ders45maps;

import ders44Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class c04_Maps {
    public static void main(String[] args) {
        //ogrencı map ınde numarası105 den buyuk olanların
        // ısım soy ısım ve bolumlerını list olarak bıze dönduren method olusturun
/*
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
           */
        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
       // ogrenciMap.put(107,"Tugay-Cil-12K-MF");
        //ogrenciMap.put(103,"Hikmet-Saglam-11-M-Soz");
        int basNo=102;
        int bitNo=120;
        List<String>isimListesi=MapDepo.numaraDegerineGöreListeOluştur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);

    }
}
