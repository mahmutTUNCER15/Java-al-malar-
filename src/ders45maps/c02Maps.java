package ders45maps;

import ders44Maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class c02Maps {
    public static void main(String[] args) {
        //öğrencıler map ınde subesı h olan öğrencılerın ısım soy ısım ve sınıflarını yazdıralım

        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();


        Set<Integer>ogrenciKeySet =ogrenciMap.keySet();
        System.out.println(ogrenciKeySet);

        Collection<String>ogrenciValueCollection =ogrenciMap.values();
        System.out.println(ogrenciValueCollection.size());
    }
}
