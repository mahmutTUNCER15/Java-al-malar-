package ders26_psssByvalue_ımmutableclass;

import java.util.ArrayList;
import java.util.List;

public class c04passbyvaluelist2 {
    public static void main(String[] args) {
        //bır method olusturalım methotda yenı bır lıste olusturun lısteye
        //sayılar lıstesındekı degerlerın 5 fazlasnıelement olarak atayın
        //sayılar lıstesıne deger olarak yenılıstı atayın
        //sayılar lıstını yazdırın

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);

        yeniListdegeriata(sayılar);

        System.out.println("method cool sdan sonra maın method da sayılar list:"+sayılar);
    }
    public static void yeniListdegeriata(List<Integer> sayılar){
        List<Integer>yeniList=new ArrayList<>();
        for (int i = 0; i <sayılar.size() ; i++) {
            yeniList.add(sayılar.get(i)+5);
        }
        sayılar=yeniList;
        System.out.println("method da sayılar lısetsinin son halı:"+sayılar);
    }

}
