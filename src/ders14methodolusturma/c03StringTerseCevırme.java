package ders14methodolusturma;

public class c03StringTerseCevırme {
    public static void main(String[] args) {
        //parametre olarak bır sıtrıng kabul edıp
        //strıngın terse cevrılmıs halıni döndüren bır methodolusturun

        String imput="java kod yazdıkca ögrenilir";
        System.out.println(stringiTerseCevir(imput));
    }
    public static String stringiTerseCevir(String imput){
        String tersStr="";
        for (int i = imput.length()-1; i >= 0; i--) {

            tersStr=tersStr+imput.charAt(i);

        }
        return tersStr;

    }

}
