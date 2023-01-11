package ders26_psssByvalue_ımmutableclass;

import java.util.Arrays;

public class c03passbyvaluearray {
    public static void main(String[] args) {
        int []arr={3,4,5};
        elementleri5arttır(arr);
        elementleri5arttır(arr);
        elementleri5arttır(arr);

        System.out.println("method call den sonra maınmethod ıcınde arr:"+Arrays.toString(arr));
    }
    public static void elementleri5arttır(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+5;


        }
        System.out.println(Arrays.toString(arr));
    }
}
