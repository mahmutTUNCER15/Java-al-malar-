package ders26_psssByvalue_ımmutableclass;

import java.util.Arrays;

public class c05passbyvaluearray2 {
    public static void main(String[] args) {
        int[] sayılar={3,4,5,6};

arrayaYeniDegerAta(sayılar);

        System.out.println(Arrays.toString(sayılar));
    }
    public static void arrayaYeniDegerAta(int[]sayılar){

        int[]yeniArray=new int[sayılar.length+2];

        for (int i = 0; i <yeniArray.length ; i++) {
            yeniArray[i]=5;

        }
        sayılar=yeniArray;

        System.out.println("method da sayıların son halı:"+ Arrays.toString(sayılar));
    }
}
