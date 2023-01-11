package ders14methodolusturma;

public class c04tekrar {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //bu ıkı sayının carpım sonucunu yenı kod yazdırmadan komsola yazdırın
        System.out.println(c01carpım.carpımMethodu(a,b));

        String c="Nasıl";
        String d="yani?";
        //bu ıkı strıngı aralarında bır bosluk burakarak  yazdırın
        System.out.println(c02stringConcet.birleştirMethod(c, d));

        String e="bu da mı oldu";
        // e strıngını tersten yazdırın
        System.out.println(c03StringTerseCevırme.stringiTerseCevir(e));

        //"bu cumleyı terse cevırın"
         String str="java cok guzeldır";
         //str butuk harf olarak yazdırın
        System.out.println(c03StringTerseCevırme.stringiTerseCevir("bu cumleyı terse cevırın"));
        System.out.println(str.toUpperCase());


    }
}
