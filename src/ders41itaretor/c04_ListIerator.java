package ders41itaretor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class c04_ListIerator {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);
        //önce ıteratoru sona goturelım

        ListIterator lit= sayılar.listIterator();
        while (lit.hasNext()){
            lit.next();

        }
        //sımddı gerıye dogru gdelleım

while (lit.hasPrevious()){
    System.out.print(lit.previous()+" ");
}


                // Eger Iterator'u nerete bıraktıgımızı hatırlayamazsak iteretor.nextIndex() ile
                // hangi index'in öncesinde oldugunu gorebiliriz.'
        System.out.println(" ");
        System.out.println(lit.nextIndex());
// iteratoe kullanarak  lıstenın tum elementlerını 5 arttırın

        while (lit.hasNext()){
      lit.set((Integer)lit.next()+5);

        }
        System.out.println(sayılar);

        //ıterator kullanarak 40dan kucuk olan elementlerı sılın
        while (lit.hasPrevious()){
            if ((Integer)lit.previous()<40){
                lit.remove();
            }
        }
        System.out.println(sayılar);
    }
}
