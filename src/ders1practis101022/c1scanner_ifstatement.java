package ders1practis101022;

import java.util.Scanner;

public class c1scanner_ifstatement {

    public static void main(String[] args) {

        /*
        Kullaniciya
                * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
        kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
        (1 kup seker = 2.77 gr)
    */
        Scanner scan = new Scanner(System.in);

        System.out.print("gunde kaç bardak çay içiyorsunuz ? :");
        double bardak= scan.nextDouble();
        System.out.print("her bardak için kac küp seker kullanıyorsunuz? :");
        double seker= scan.nextDouble();
        double yıllıkTüketimKG= bardak + seker * 2.77 * 365 / 100;
        double kırkYıllıkTüketim= yıllıkTüketimKG * 40;

        if (seker==0){
            System.out.print("hey Women,go on)");

        }else {
            System.out.print("yıılık seker tüketiminiz"+yıllıkTüketimKG+"kğ'dır.\n" +
                    "40yıılık seker tüketiminiz" + "kırkyıllıkTüketim" + "kg'dır" );








        }
}
}