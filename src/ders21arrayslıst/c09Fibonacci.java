package ders21arrayslıst;

import java.util.Scanner;

public class c09Fibonacci {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
        //         kaydedin ve yazdirin
        //0 1 1  2 3 5 8......
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozıtıf bır tam sayı gırınız");
        int gırılenSayı= scan.nextInt();

        if (gırılenSayı<0){
            System.out.println("fibonacci serisi için 2den buyuk tamsayı gırmelısın");
        }else if (gırılenSayı==0) {
            System.out.println("0 dan kucuk fibonacci sayısı yoktur");
        } else if (gırılenSayı==1) {
            System.out.println("1 den kucuk tek fibonacci sayısı vardır:0");
        }else {
          // fibonaccisayılarınıyazdırın(gırılenSayı);



        }


    }
}
