package ders43Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c03Set {
    public static void main(String[] args) {
        //verılen bır arrays ı tekrar eden elementlerını sılıp her ekementın bır kere kullanıldıgı hale getırın

        int[] arr = {6, 4, 3, 2, 5, 2, 1, 7, 8, 9, 3, 2, 1, 8, 3, 5, 6, 4, 8, 1};
        Set<Integer> gecıcıSet = new HashSet<>();
        for (Integer each : arr
        ) {
            gecıcıSet.add(each);

        }
        arr=new int[gecıcıSet.size()];

        int index = 0;
        for (Integer each : gecıcıSet
        ) {
            arr[index] = each;
            index++;

        }
        arr = arr;
        System.out.println(Arrays.toString(arr));
    }
}