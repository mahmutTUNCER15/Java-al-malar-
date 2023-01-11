package ders1practis17102022;

import java.util.Scanner;

public class c01hesapmakınesi {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı tane tamsayı giriniz");
   int sayı1=scan.nextInt();
   int sayı2= scan.nextInt();
        System.out.println("yapmak istediniz işlemi secınız"+
                "\n\t1.toplama\n\t2.cıkarma\n\t3.carpma\n\t4.bölme");
        int işlem=scan.nextInt();
        //char.işlem2=scan.next().charAt(0);  kullanıcıdan char alma yolları..........
        if (işlem==1) System.out.println("girdiginiz sayıların toplamı="+(sayı1+sayı2));
        else if (işlem==2)System.out.println("girdiginiz sayıların farkı="+(sayı1-sayı2));
        else if (işlem==2)System.out.println("girdiginiz sayıların carpımı="+(sayı1*sayı2));
        else if (işlem==2)System.out.println("girdiginiz sayıların farkı="+(sayı1/sayı2));
        else System.out.println("hatalı gırıs yaptınız");
        //****************** 2cözum




    }


}
