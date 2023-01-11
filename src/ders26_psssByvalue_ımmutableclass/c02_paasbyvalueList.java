package ders26_psssByvalue_ımmutableclass;

import java.util.ArrayList;
import java.util.List;

public class c02_paasbyvalueList {
    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();
        // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
        // ve method'da listenin son halini yazdiralim
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);

        elementleri5arttır(sayılar);
        elementleri5arttır(sayılar);
        elementleri5arttır(sayılar);

        System.out.println(sayılar);
    }
    public static void elementleri5arttır(List<Integer>sayılar){
        for (int i = 0; i <sayılar.size() ; i++) {
            sayılar.set(i,sayılar.get(i)+5);


        }
        System.out.println(sayılar);
    }
}
