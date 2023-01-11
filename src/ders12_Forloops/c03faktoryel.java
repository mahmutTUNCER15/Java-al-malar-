package ders12_Forloops;

public class c03faktoryel {
    public static void main(String[] args) {
        //kullanıcının verdıgı sayının faktoriyelını bulalım
        int sayı0 = 10;
        int faktoryel = 1;

        //for (int i =sayı0; i >=1 ; i--) {

        int i = 0;
        faktoryel = faktoryel * i;

        System.out.println(faktoryel);

        //kullanıcıdan aldıgınız 10 faktoryel snucunu bukunuz.

        int sayı1 = 20;
        int faktoryel2 = 2;

        for (i = sayı1; i > 2; i--) {
            faktoryel2 = faktoryel2 * i;

            System.out.println(faktoryel2);


        }
        //1'den 100'e (sınırları dahil olan) kadar olan sayıları toplayınız.

            int toplam=0;
        for (int i12 = 1; i <=100 ; i++) {
            toplam=toplam+i;


        }
        System.out.println(toplam);


    }

    }

