package day5;

import java.util.Scanner;

public class c02soru {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 5 adet sayı gırınız");

        int enbuyuksayı=0;
        int sayaç=0;
        while (sayaç<5){
            int sayı= scan.nextInt();
            if (sayı>enbuyuksayı){
                enbuyuksayı=sayı;
            }
            sayaç++;
        }
        System.out.println("gırılen sayıların en buyugu:"+enbuyuksayı);




    }
}
