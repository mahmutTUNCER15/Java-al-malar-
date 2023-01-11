package ders19sagakaydır;

import java.util.Arrays;

public class c06arrayeYenıDegerAtama {
    public static void main(String[] args) {
        String str="java";

        str="hava";

        String []arr1={"ali,veli"};
        String []arr2={"a","b","c"};

        arr1=arr2;
        System.out.println(Arrays.toString(arr1));
            //1 var bır Arrayın uzunlugu degıstırılemez
        // var olan arraye yenı bır atama yapılabılır.

        //2 yenı atama ornegı
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));
        // 2yontem
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));

        //3 yenı olusturulan bır array e susulu parantez ıcınde atama yapabılırız
        //ancak var olan bır array yenı deger ataması ıcın {} kullanımaz




    }
}
