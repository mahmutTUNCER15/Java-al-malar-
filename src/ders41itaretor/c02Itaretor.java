package ders41itaretor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c02Itaretor {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);
        Iterator it1= sayılar.iterator();

        //tum elementlerı ıtaretor kullanarak yazdıralım
        System.out.println(it1.hasNext());
        System.out.println(it1.next());

        System.out.println(it1.hasNext());
        System.out.println(it1.next());

        System.out.println("==============" );

        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        Iterator it2=sayılar.iterator();
        System.out.println("============");

        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
