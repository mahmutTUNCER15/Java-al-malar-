package ders14methodolusturma;

import java.util.Scanner;

public class c01carpım {
    //maın method icinde kullanıcıdan ıkı sayı alın
    //bu ıkı sayıyı parametre olarak kabul edıp carpımlarını maın method'a döndurun bır method olusturun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ıkı sayı gırınız");
        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();
        System.out.println(carpımMethodu(sayı1, sayı2));

        double carpımSonucu=carpımMethodu(6,2);

    }
    public static double carpımMethodu(double sayı1,double sayı2){
        System.out.println("carpım method'calıstır");
        return sayı1*sayı2;

}
}
