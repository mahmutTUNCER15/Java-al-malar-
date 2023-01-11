package ders18atreys;

import java.util.Arrays;

public class c02arrays {
    public static void main(String[] args) {
        String []arr={"ali","ulus","nesrin"};
        //bu arrays ın tum elementlerını aralarında bır bosluk bırakarak yazdıralım
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
//  bu array ı array olarak yazdıralım
        System.out.println(arr);
        // array bır obje non-prımıtıv data oldugundan java referansını yazdırır
        // array ı  array olarak yazdırmak ıcın array calasından yazrdım almalısınız
        System.out.println(Arrays.toString(arr));

    }
}
