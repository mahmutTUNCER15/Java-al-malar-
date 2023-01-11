package ders20multıdimensionalarrarys;

import java.util.Arrays;

public class c07MDA_Soru {
    public static void main(String[] args) {
        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output:                      [5, 7, 11]
        int[][] arr = {{3,4,5}, {2,3,6,7}};
        //inner ıkı array olacagını ama bunların uzunluklarının degısebılecegını kabul ettık

        int ortakindexsayısı =arr[0].length<arr[1].length?arr[0].length:arr[1].length;
        System.out.println(ortakindexsayısı);
        int[]ortakİndexToplamlarıarr=new int[ortakindexsayısı];
        for (int i = 0; i <ortakİndexToplamlarıarr.length ; i++) {
            ortakİndexToplamlarıarr[i]=arr[0][i]+arr[1][i];

        }
        System.out.println(Arrays.toString(ortakİndexToplamlarıarr));
    }
}
