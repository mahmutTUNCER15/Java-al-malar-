package ders12_Forloops;

public class c04rakamlartoplamı {

    public static void main(String[] args) {
        //kullanıcının verdıgı sayının rakamlar toplamını bulun

        int sayı=1453112341;
        String sayıstr=" "+sayı;
        int birierBasanmagı=0;
        int rakamlarTolamaı=0;
        for (int i = 1; i <=sayıstr.length() ; i++) {
            birierBasanmagı=sayı%10;
            rakamlarTolamaı=rakamlarTolamaı+birierBasanmagı;
            sayı=sayı/10;

        }
        System.out.println(rakamlarTolamaı);




    }
}
