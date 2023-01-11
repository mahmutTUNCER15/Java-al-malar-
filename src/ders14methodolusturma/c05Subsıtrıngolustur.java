package ders14methodolusturma;

public class c05Subsıtrıngolustur {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index’i dahil,
        // bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        //- kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

        String imput="java ne kadar güzel";
        int baslangİcindexi=5;
        int bitişİdexi=7;
        kendiSubstringmethodumuz(imput,baslangİcindexi,bitişİdexi);
        kendiSubstringmethodumuz(imput="java", 1, 3);
        kendiSubstringmethodumuz(imput="deneme", 6,3);
        kendiSubstringmethodumuz(imput=",java",6,8);
    }
    public static void kendiSubstringmethodumuz(String imput,int baslangıcindexi,int bitişindexi){
        if (baslangıcindexi>bitişindexi){
            System.out.println("balangıc indexi,bitiş indexinden buyuk olamaz");
        }else if (bitişindexi>=imput.length()){
            System.out.println("bitiş indexi strinin dışında");
        }else {
            //baslangic ve bitis indexlerine gore baslangic index’i dahil
            //bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun

            for (int i = baslangıcindexi; i <bitişindexi ; i++) {
                System.out.print(imput.charAt(i));
                System.out.print(" ");

            }
        }

    }
}
