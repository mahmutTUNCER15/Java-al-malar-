package ders15overloading_whitloop;

public class c07Whileloop {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */
        int sayı=3;
        int üs=5;
        üshesapla(sayı,üs);

    }
    public static void üshesapla(int sayı,int üs){
        int sonuç=1;
        while (üs>0){
            sonuç*=sayı;
            üs--;
            System.out.println(sonuç);
        }

    }
}
