package ders21arrayslıst;

import java.util.ArrayList;
import java.util.List;

public class c05_set {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.set(0, 8));

        System.out.println(sayilar.set(1, 9));

        System.out.println(sayilar);

    }
}
