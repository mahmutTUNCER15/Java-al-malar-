package ders47MapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class c04_soru {
    public static void main(String[] args) {
     //verılen bır cumlede kullanılan karekterlerı ve kacar kere kullnıldıgını yazdırın

        String str="javayı balonu patlatmadan bıtırelım ";

      String[] strArr=str.split("");

        Map<String,Integer>kullanımMıktarlarıMap=new HashMap<>();

        for (int i = 0; i < strArr.length ; i++) {

            kullanımMıktarlarıMap.putIfAbsent(strArr[i],1);

            System.out.println(kullanımMıktarlarıMap);



        }
        System.out.println(kullanımMıktarlarıMap);
    }

}
