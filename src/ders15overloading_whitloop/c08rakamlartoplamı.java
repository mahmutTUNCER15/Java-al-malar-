package ders15overloading_whitloop;

public class c08rakamlartoplamı {
    public static void main(String[] args) {
        /*Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

         */
int sayı=14531111;
int birlerBasamagı=0;
int rakamlarToplamı=0;
while (sayı!=0){
    birlerBasamagı=sayı%10;
    rakamlarToplamı+=birlerBasamagı;
    sayı /=10;
}
    System.out.println(rakamlarToplamı);
    }
}
