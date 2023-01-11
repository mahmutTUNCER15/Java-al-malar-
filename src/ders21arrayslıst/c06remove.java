package ders21arrayslıst;

import java.util.ArrayList;
import java.util.List;

public class c06remove {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }
        sayilar.remove(2);
        System.out.println(sayilar);
       sayilar.remove(5);
        System.out.println(sayilar);

        Integer sılınecekObje=4;
        sayilar.remove(sılınecekObje);
        System.out.println(sayilar);
        // tum uclerı sldırelım

        sılınecekObje=3;

        while (sayilar.contains(sılınecekObje)){
            sayilar.remove(sılınecekObje);

        }
        System.out.println(sayilar);
        sılınecekObje=10;
        System.out.println(sayilar.remove(sılınecekObje));

        sayilar.remove(20);

    }
}
