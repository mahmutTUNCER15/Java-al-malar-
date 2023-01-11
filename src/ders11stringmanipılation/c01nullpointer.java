package ders11stringmanipılation;

public class c01nullpointer {

    public static void main(String[] args) {

        String str="";
        //str bire deger atanmaıştır.

        System.out.println(str);

        String str2;
        // str iki olusturuldu deger atanmadı

        //System.out.println(str2); //deger atanmadıgı için yazdırılmaz

        //System.out.println(str2.concat("java"));//deger atnmadıgı için metod la kullanılmaz


        str2="java candır";
        System.out.println(str2);

        System.out.println(str2.concat("."));

        String str3=null;// str3 e deger atnmamıstır.
                        // dger atmaadıgımızın farkında oldugumuzu bılıyoruz

        //System.out.println(str3.concat("java"));

        System.out.println(str3+"Java");






            }

}
