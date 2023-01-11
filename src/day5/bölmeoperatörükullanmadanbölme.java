package day5;

import java.util.Scanner;

public class bölmeoperatörükullanmadanbölme {

     static int bölüm=0;
    public static void main(String[] args) {
        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bolmek ıstedıgınız sayıyı gırınız");
        int bolunen=scan.nextInt();
        System.out.println("lutfen bolen sayıyı gırınız");
        int bolen =scan.nextInt();
        bol(bolunen,bolen);
        System.out.println(bolunen+"/"+bolen+"="+bol(bolunen,bolen));
    }
    private static int bol(int bolunen, int bolen) {

        while (bolunen>=bolen){
            bolunen-=bolen;
            bölüm++;

        }
return bölüm;
    }


}

