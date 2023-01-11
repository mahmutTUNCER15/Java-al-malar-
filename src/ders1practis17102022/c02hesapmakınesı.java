package ders1practis17102022;

import java.util.Scanner;

public class c02hesapmakınesı {
    /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
     */
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı tane tamsayı giriniz");
        double sayı1=scan.nextDouble();
        double sayı2= scan.nextDouble();

        System.out.println("yapmak istediniz işlemi secınız"+
                "\n\t-.toplamaiçin+\n\t2.cıkarma içn-\n\t3.car0pma için*\n\t4.bölme için/");

        char islem= scan.next().charAt(0);
        //String işlem2=scan.next();
        System.out.println(caculator(islem,sayı1,sayı2));
}
public static String kullanıcıdanİşlemAl(){
      String imput= scan.next();//plus Minus Time Divide
      return imput.substring(0,1).trim().toLowerCase();

}
public static double caculator(char işlemTipi,double num1,double num2){
        double sonuc=0;
        switch (işlemTipi){
            case '+':
                sonuc= num1+num2;
                break;
            case '-':
                sonuc=num1-num2;
                break;
            case '*':
                sonuc=num1*num2;
                break;
            case '/':
                sonuc=num1/num2;
                bölme(num1,num2);
                break;


    }
return sonuc;
}

    private static double bölme(double bolunen, double bolen) {
        if (bolen==0 && !(bolunen==0))
        return Double.POSITIVE_INFINITY;
        else if (bolen==0&&bolunen==0)
        return Double.NaN;
        else return bolunen/bolen;


        }
    }

