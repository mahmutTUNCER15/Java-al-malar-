package ders41itaretor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c03_Iterator {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);

        //iteretor lkullanarak bu listeden 15 ile 35 arasındakı sayıları sılın
        Iterator it1=sayılar.iterator();
        Integer element;

        while (it1.hasNext()){
element=(Integer)it1.next();
if (element>15 );

           // it1.next()
        }
    }
}
