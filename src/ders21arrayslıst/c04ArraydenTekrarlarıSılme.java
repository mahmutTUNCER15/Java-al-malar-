package ders21arrayslıst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c04ArraydenTekrarlarıSılme {
    public static void main(String[] args) {
        // verılen bır array dekı tekrar eden sayıarı
        // bır kere olacak sekılde duzenleyın
        int [] arr={1,2,3,4,3,5,3,2,5,1,2,4,5,3,4,5};

        //bu soruyu array le yapmak cok zor
        // bunun yerıne önce bır lıste atıp bu array ın elemanlarını tek tek inceleyıp
        //tekrarsız olanları bır lıste atalım

        List<Integer>tekrarsızListe=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsızListe.contains(arr[i]));{

                tekrarsızListe.add(arr[i]);
            }
        }
        System.out.println("tekrarsız lıste:"+tekrarsızListe);
        //en son o lıste dekı elemanları ıceren bır array olusturan
        //yenı array ı eskı array e deger olarak atayalım

        arr=new int[tekrarsızListe.size()];

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=tekrarsızListe.get(i);
        }
        System.out.println("array ın tekrarsız lıste:"+Arrays.toString(arr));
    }
}
