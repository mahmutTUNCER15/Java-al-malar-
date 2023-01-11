package ders19sagakaydır;

import java.util.Arrays;

public class c07arrayeYenıElementEkleme {
    public static void main(String[] args) {
        int[] arr={2,4,6};
        // bu array e 4. elemet olarak 8 ekleyelım
        /*
        var olan bıe array e yenı elaman eklenemez
        ama yenı deger atanabılır
        önce [2,4,6,8] olusturup seklınde yenı bır array olusturup
        sonra arr2 degerını arrr'ye atayabıliriz
         */
        // yenı array olusturalım
        // array2 ye konulacak dataların turu
        // uzunugu eskı arrayın bır fazlası
        int[] arr2=new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
            System.out.println(Arrays.toString(arr2));

            arr2[arr2.length-1]=8;
            System.out.println(Arrays.toString(arr2));

            //arr arrayıne yenı deger olarak olusturdugumuz arr2 atayacagız
            arr=arr2;
            System.out.println(Arrays.toString(arr));


        }
    }
}
