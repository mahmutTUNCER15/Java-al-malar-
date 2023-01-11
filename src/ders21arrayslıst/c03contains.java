package ders21arrayslıst;

import java.util.ArrayList;
import java.util.List;

public class c03contains {
    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();

        int[]arr={2,5,7,9,1,0,4,5,6,3,4,5,4,6};

        for (int i = 0; i < arr.length ; i++) {

            sayılar.add(arr[i]);

        }
        System.out.println(sayılar.contains(3));

        System.out.println(sayılar.contains(8));
    }
}
