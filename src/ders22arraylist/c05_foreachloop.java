package ders22arraylist;

import java.util.ArrayList;
import java.util.List;

public class c05_foreachloop {
    public static void main(String[] args) {
     //   Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
       // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.
        String[]arr={"sumeyra","mehmet","ekrem","yılmaz","ayşe"};
        List<String>yenılıst=new ArrayList<>();
        for (String each:arr
             ) {
            if (each.length()%2==0){

                yenılıst.add(each.substring(0,each.length()/2));
            }else {
                yenılıst.add(each.substring(0,each.length()/2));
            }
        }

        System.out.println(yenılıst);
    }
}
