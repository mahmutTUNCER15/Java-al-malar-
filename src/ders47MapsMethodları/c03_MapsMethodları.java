package ders47MapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class c03_MapsMethodları {
    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        //c key olarak varsa degerını 3 arttır
        if (mp1.containsKey("C")){
            mp1.put("C",mp1.get("C"+3));
        }
        System.out.println(mp1);
        //b key olarak varsa degerını 2 ile carp

        mp1.computeIfPresent("B",(k,v)->2+v);
        System.out.println(mp1);

        //A key olarak varsa degerını 5 azaltın
        mp1.computeIfPresent("A",(k, v)->v-5);
        System.out.println(mp1);



        //map de D yoksa value su11 olacak sekılde ekleyelım
        if (!mp1.containsKey("D")){
            mp1.put("D",11);
        }
        System.out.println(mp1);

        //E yoksa degerı 8 ekleyelım

        mp1.computeIfAbsent("E",v->8);
        System.out.println(mp1);

        //e nın degerını 4 arttır

        mp1.compute("E",(k,v)->v+4);
        System.out.println(mp1);

        mp1.compute("R",(k,v)->v=3);
        System.out.println(mp1);



        mp1.compute("F",(k,v)->v*3);
        System.out.println(mp1);


    }
}
