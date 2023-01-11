package ders1practis14112022;

import java.util.Scanner;

public class c01SayılarınToplamıArrays {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayi alip, bu sayilari bir Array'de toplayip
        // bu sayilarin toplamini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        double [] num;
        double sum=0;
        int sıze;
        System.out.println("kac adet sayı toplamak istiyorsunuz ?");
        sıze=scan.nextInt();

        num=new double[sıze];
        for (int i = 0; i <sıze ; i++) {

            System.out.print("lutfen sayı gırınız");

            num[i]=scan.nextDouble();
            sum+=num[i];


        }

        System.out.println( "sayılar Array'i"+
                "sayıların toplamı ="+sum);





    }
}
