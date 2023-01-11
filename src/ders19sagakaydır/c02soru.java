package ders19sagakaydır;

import java.util.Arrays;

public class c02soru {
    public static void main(String[] args) {
       // Verilen bir int array'de en kucuk ve en buyuk sayilari
      // yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9};
        enBuyukEnKucukElementYazdır(arr);
    }
    public static void enBuyukEnKucukElementYazdır(int[]arr){
        Arrays.sort(arr);
        System.out.println("En buyuk element:"+arr[arr.length-1]);
        System.out.println("En Kucuk element:"+arr[0]);
    }
}
