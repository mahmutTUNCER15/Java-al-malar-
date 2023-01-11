package ders21arrayslıst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c08_KullanıcıyaLıstOlusturtma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeOluştur());

    }
    public static List<String>listeOluştur(){
        List<String>isimler=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        String girilenIsım="";
        while (!girilenIsım.equalsIgnoreCase("q")){
            System.out.println("lutfen lısteye eklemek ıcın isim gırınız"+
                    "\n bitirmekiçin q ya basınız");
            girilenIsım=scan.nextLine();
            if (girilenIsım.equalsIgnoreCase("q")){
                isimler.add(girilenIsım);
            }
        }
        return isimler;
    }

}
