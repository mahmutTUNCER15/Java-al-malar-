package ders1praktıcs07112022;

import java.util.Arrays;

public class Q2Arrays {
    public static void main(String[] args) {
        int [] integers;
        integers=new int[5];
        integers[0]=1;
        integers[1]=2;
        integers[2]=3;
        integers[3]=4;
        integers[4]=5;

        System.out.println(Arrays.toString(integers));

        char[] carlar=new char[3];

        carlar[0]='A';
        carlar[1]='B';
        carlar[2]='C';
        String charlarString=Arrays.toString(carlar);
        System.out.println(charlarString);

        String[] isimler=new String[3];
        isimler[0]="Ayse";
        isimler[1]="Fatma";
        isimler[2]="Hayriye";

        String isimlerString=Arrays.toString(isimler);
        System.out.println(isimlerString);

        String boskova=isimler[0];
        isimler[0]=isimler[1];
        isimler[1]=boskova;

        System.out.println("yeni Hali:" + Arrays.toString(isimler));




    }
}
