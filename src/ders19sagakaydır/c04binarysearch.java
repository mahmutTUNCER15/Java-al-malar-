package ders19sagakaydır;

import java.util.Arrays;

public class c04binarysearch {
    public static void main(String[] args) {
        int []arr={1,8,9,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,9));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,9));


        System.out.println(Arrays.binarySearch(arr,-3));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,100));

    }

}
