package ders12_Forloops;

public class c02foorlups {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println(" ");
        //iki basamaklı sayıardan 7 ile bölunebilenlerı yan yana yazdırın
        for (int i = 10; i <100 ; i++) {
            if(i%7==0) System.out.print(i +" ");
        }

            System.out.print(" ");
            // 13 den balayarak 7ser 7ser arttırup yazdıralım

            for (int i = 13; i <=99 ; i+=7) {
                System.out.print(i + " ");
            }
        System.out.println(" ");
            //1den 10 Kadar (sınırları dahkı)sayıların karelerını yazalım
        for (int i = 0; i <=10 ; i++) {
            System.out.print( i*i+ " ");

        }
        System.out.println("");
        //18den 45 Kadar (sınırları dahkı)sayıların karelerını yazalım
        for (int i = 1; i <=15 ; i++) {
            System.out.print(i*i+ " ");


        }
        System.out.println(" ");
        //kullanıcıdan bırsayı alalım 0 dan baslayıp 100 kadar bolumlerını yadrıralım
        for (int i = 0; i <=100 ; i++) {
           if (i%10==10)System.out.print(i+" ");
        }

            }

                }








