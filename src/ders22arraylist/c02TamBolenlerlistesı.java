package ders22arraylist;

import java.util.ArrayList;
import java.util.List;

public class c02TamBolenlerlistesı {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen
        // tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

       int imput=1280;
        System.out.println(tamBolenlerLıstesıoluştur(imput));

    }
    public static List<Integer>tamBolenlerLıstesıoluştur(int imput){
        List<Integer>tambolenlerlistesi=new ArrayList<>();
        for (int i = 0; i <=imput ; i++) {
            if (imput%i==0){
                tambolenlerlistesi.add(i);
            }

        }
     return tambolenlerlistesi;
    }

   }
