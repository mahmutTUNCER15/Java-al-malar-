package ders47MapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class c01_mapsMedhotları {
    public static void main(String[] args) {
        Map<String,Integer>mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        mp1.put("D",null);

        System.out.println(mp1.putIfAbsent("D", 9));
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent("D", 15));

        /*putIfAbsent (K,V) eğer K daha önce yoksa ekler ve null döner
         eger K daha önce varsa eklemek istediğimiz yeni değeri eklemez
         ve eski var olan değeri bize döndürüri
         */

        Map<Integer,String>mp2=new HashMap<>();
        System.out.println(mp2.put(2, "S"));
        System.out.println(mp2.putIfAbsent(3, "K"));
        System.out.println(mp2.put(3, "Z"));
        System.out.println(mp2);

    }
}
