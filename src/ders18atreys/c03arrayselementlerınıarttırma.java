package ders18atreys;

import java.util.Arrays;

public class c03arrayselementlerınıarttırma {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.
       int[]arr={2,4,6,8};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;
        }
        System.out.println(Arrays.toString(arr));
        arr=elementleri2arttır(arr);

        System.out.println(Arrays.toString(arr));
    }
public static int[]elementleri2arttır(int[]arr){
    for (int i = 0; i < arr.length ; i++) {
        arr[i]=arr[i]+2;


    }
    return arr;
}
}

