package ders21arrayslıst;

import java.util.ArrayList;
import java.util.List;

public class c01elemenetEkleme {
    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();
        System.out.println(sayılar);

        System.out.println(sayılar.add(10));

        System.out.println(sayılar);

        sayılar.add(20);

        System.out.println(sayılar);//tersı soylenmedıkce elementın sonuna eklenır

        sayılar.add(1,15);

        System.out.println(sayılar);

       // listenın basına 44 ekletın
        sayılar.add(0,44);

        System.out.println(sayılar);

        List<Integer>ekleneceklıste=new ArrayList<>();

        ekleneceklıste.add(3);
        ekleneceklıste.add(5);

        sayılar.addAll(ekleneceklıste);

        System.out.println(sayılar);
        //sayılar listesının basındakı 44 den sonraya eklenecek lısteyı bır kez daha ekleyın.

        sayılar.addAll(1,ekleneceklıste);

        System.out.println(sayılar);
    }
}
