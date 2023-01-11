package ders42Collectıons;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class c02LİnkedListSoru {
    public static void main(String[] args) {
        //Soru : Kullanicidan deger alarak iki String liste olusturun.
        // Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        //Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        //liste1 : …….
        //liste2 : …….
        //ortak elementler : …….
        System.out.println("önce list1'İ olusturulam");
        List<String> list1=kullanıcıdanAlarakListOluştur();
        System.out.println("simdi listeyı olusturalım");
        List<String> list2=kullanıcıdanAlarakListOluştur();
        System.out.println("Liste1:"+list1);
        System.out.println("Liste2:"+list2);
        System.out.println("ortak element:"+list1);
    }
    public static List<String>kullanıcıdanAlarakListOluştur(){
        //Soru : Kullanicidan deger alarak iki String liste olusturun.maırn method a dondur
        // Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        List<String> isimListesi=new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        String isim=" ";
        while (!isim.equalsIgnoreCase("o")){
            System.out.println("listeye eklemek için isim giriniz\n" +
                    "bitirmek için 0 a basıız");
            isim=scan.nextLine();
            if (!isim.equalsIgnoreCase("0")){

            }

        }

        return isimListesi;
    }
}
