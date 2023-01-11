package ders17Scope;

public class c01lokalVariables {
    public static void main(String[] args) {
        //bır method un ıcıriside olusturulan varıabla'lerın scope'u ıcınde olusturdukları scop'u
        //içinde olusturuldukları methodtur
          //      o method dısında ulasılamazlar.

        int say=10;
        String isim="Ramazan";
        for (int i = 0; i <10 ; i++) {
            String adres="Ankara";
            System.out.print("Ankara ");
            //bır lop içerisinde olusturulan variab'ler sadece o loop içerisinde gecerlıdır.

        }

    }
    public static void method1(){

        boolean dogruMu=true;

    }



}
