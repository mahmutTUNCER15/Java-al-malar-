package ders46Maps;

import ders44Maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class c01_EntrySet {
    public static void main(String[] args) {
        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin
        // onceki iki derste key(Set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde
        // bu islemi yapmak zor olur
        // Bunun icin Java Entry Interface'ini olusturmustur
        // Entry'ler key=Value ikilisini 1 Entry olarak kabul ederler
        Map <Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 6

        ogrenciMap.put(108,"Mehmet-Erken-12-Mf");
        /*
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            }
         */
        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        /*
            [
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            ]
            aralarindaki farklar
            1- yukaridaki map, bu Set
            2- yukaridakinde {} kullaniyor, bu ise [ ]
            3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
               Entry'de ise K=V  ikisi birlikte bir element olusturuyor
         */
        // entry seti icerisindeki entry'leri biz de sira numarasi vererek yazdiralim
        int siraNo=1;
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {
            System.out.println(siraNo + "-   " + eachEntry);
            siraNo++;
        }
        // Entry'leri kullanarak Key'leri yazdirin
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {
            System.out.println(eachEntry.getKey());
        }
        // Entry'leri kullanarak tum ogrencilerin siniflarini 1 artirin
        // 12. sinifta olan varsa, map'ten cikarin
        String entryValu;
        String[]entryValueArr;
        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
        ){
            //her bır entry dekı value yı alıp parcalayıp
            // ıstenen apdate ıyapıp yenıden map eeklememız lazım

           entryValu=eachEntry.getValue();
           entryValueArr=entryValu.split("-");

           if (entryValueArr[2].equals("12")){
               //ogrencının sınıfı 12 ıse
               eachEntry.setValue("mezun oldu");
           }else{
               //ogrencının sınıfı 12 degılse
               int sınıf=Integer.parseInt(entryValueArr[2]);
               sınıf++;
               entryValueArr[2]=sınıf+"";
               eachEntry.setValue(
                               entryValueArr[0]+" "+
                               entryValueArr[1]+" "+
                               entryValueArr[2]+" "+
                               entryValueArr[3]+" "+
                               entryValueArr[4]);
           }
        }
        System.out.println(ogrenciMap);

    }
}