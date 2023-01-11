package ders26_psssByvalue_ımmutableclass;

public class c04PassByValue {
    public static void main(String[] args) {

        double fiyat=100;

        System.out.println(indirimuygula(fiyat));
        System.out.println(indirimuygula(fiyat));
        System.out.println(indirimuygula(fiyat));

        System.out.println(fiyat);

        fiyat=indirimuygula(fiyat);

        System.out.println("indirm uygulanmıs yeni fiyat:"+fiyat);
    }
    public static double indirimuygula(double ahmet){
        ahmet=ahmet*0.9;
        return ahmet;

    }
}

