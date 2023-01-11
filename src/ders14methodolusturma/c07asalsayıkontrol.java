package ders14methodolusturma;

public class c07asalsayıkontrol {
    /*Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. 
    Girilen sayinin asal sayi olup olmadigini kontrol edip, 
    sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
     */
    public static void main(String[] args) {
        int sayı=24;
        System.out.println(asalSayıKontrolet(sayı));
        System.out.println(asalSayıKontrolet(23));
        System.out.println(asalSayıKontrolet(5674531));
    }
    public static String asalSayıKontrolet(int sayı){
        String sonuc=" ";
        for (int i = 2; i <=(sayı-1) ; i++) {
            if (sayı%i==0){
                sonuc="asal degil";
                break;

            }

        }
        if (!sonuc.equals("asal degıl")){
            sonuc="asal degıl";
        }
    return sonuc;
    }

}
