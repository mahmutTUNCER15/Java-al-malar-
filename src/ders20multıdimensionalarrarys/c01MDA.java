package ders20multıdimensionalarrarys;

import java.util.Arrays;

public class c01MDA {
    public static void main(String[] args) {


    int[][] arr={{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length); //5

        System.out.println(arr[2].length);//5,6,7

        System.out.println(Arrays.toString(arr[1]));//4,3,1 dırek yazdırılamaz

        System.out.println(arr[1]);

        System.out.println(Arrays.deepToString(arr));

        System.out.println(arr[3][0]);
}
}
