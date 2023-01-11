package ders15overloading_whitloop;

import java.util.Scanner;

public class c05Whileloop {
    public static void main(String[] args) {
        //kullanıcıdan toplanmak ıcın  sayı alın sayıların toplamı 500'e esit olur veya gecer
        //gırılen sayıadedi,
        //gırılen sayıalrıntoplamı c01overloading
       //"bu kadar yeter" yazdırın

        Scanner scan=new Scanner(System.in);
        double gırılensayı=0;
        double toplam=0;
        int sayac=0;
        while (toplam<500) {
            System.out.println("toplamak için sayı gırınız");
            gırılensayı=scan.nextDouble();
            toplam+=gırılensayı;
            sayac++;
            System.out.println("girilen" +sayac+"sayının toplamı+" +toplam+"olu.bu kadar yete");

        }

}
}
