package ders37Exceptıons;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class c01ChektExceptıons {
    public static void main(String[] args) throws IOException {

        String dosyaYolu="src/ders36chekException/Deneme.txt";

        int k;
try {
    FileInputStream fis = new FileInputStream(dosyaYolu);
    while((k=fis.read())!=-1) {
        System.out.print((char) k);
    }
}catch (FileNotFoundException e){
        System.out.println("Dosyayolu yanlış veya dsya arızalı");


        }catch (IOException e){
    System.out.println("Dosya okuma veya yazma ıle ılgılı bır sorun var");
        }
/* Bir kod calışırken birden fazla exception oluşma ihtimali varsa
        bu kodun çalışır hale getirmek için dört ihtimal vardır

        1- Her bir exception için iç iç TRY CATCH blokları kullanmak
        2- 1 tane TRY blogu birden fazla CATCH blogu olusturmak
        3-Method sıgnature'a tum exception ihtimallerini yazmak
        4- Eger Muhtemel exception'ların tümünü kapsayan daha geniş kapsamlı
        bir exception varsa onu kullanmak
         */
        /* 2. ve 3. ıhtımallerde olusması muhtemel exception'lar arasında parent-chıld
        ilişkisi olup olmadıgı kontrol edilmelidir.
        aralarında parent chıld ilişkisi yoksa exceptionları istediğimiz sırada yazabiliriz

        ANCAK parent chıld ilişkisi varsa önce chıld sonra Parent yazılmalıdır.
        AKSİ TAKDİRDE parent daha kapsamlı oldugundan tum exceptionları yakalar ve
        aşagıdakı chıld exception işlevsiz kalır java bu durumu kabul etmez . CTE verir
         */
    }
}
