package ders25_staticKeyword;

public class c04_passByValue {
    public static void main(String[] args) {

        double fiyat=100;
        System.out.println(indirimuygula(fiyat));
        System.out.println(indirimuygula(fiyat));
        System.out.println(indirimuygula(fiyat));
        System.out.println(fiyat);

    }
    public static double indirimuygula(double ahmet){
        ahmet=ahmet*0.9;
        return ahmet;

    }
}
