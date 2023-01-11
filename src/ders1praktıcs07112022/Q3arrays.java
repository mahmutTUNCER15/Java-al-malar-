package ders1praktıcs07112022;

import java.util.Arrays;

public class Q3arrays {
    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {

        float[] sayılar = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};

        int toplam = 0;

        for (int i = 0; i < sayılar.length; i++) {

            toplam += sayılar[i];

            System.out.println("toplam:" + toplam);
            toplam = 0;

            int index = sayılar.length - 1;

            while (index >= 0) {
                toplam += sayılar[index];
                index--;
                System.out.println("toplam:" + toplam);
            }
            toplam = 0;

            index = 0;

            while (index >= 0) {
                toplam += sayılar[index];
                index--;
                System.out.println("toplam:" + toplam);
            }
            System.out.println("toplam:"+toplam);
            toplam=0;
            index=0;
do {
    toplam += sayılar[index];
    index++;

} while (index< sayılar.length-1);
}
            System.out.println("toplam:"+toplam);
        }
    }
