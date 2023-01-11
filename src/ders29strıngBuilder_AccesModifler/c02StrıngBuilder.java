package ders29strıngBuilder_AccesModifler;

public class c02StrıngBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("java candır");

        System.out.println(sb1.reverse());

        System.out.println("tersini yazdırdıktan sonra sb1:"+sb1);

        System.out.println(sb1.insert(0,"."));

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("java candır.");

        String str="java candır";

        System.out.println(sb1==sb2);//false icerek aynı olsa bıle folse verır

        System.out.println(sb1==sb1);//kedısı ıle karsılastırılırsa aynı cıkar

        //System.out.println(sb1==str); farklı ıkı data turu ıle karsılastırılamaz.

        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
        System.out.println(sb1.equals(str));
        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3=new StringBuilder("jaka kandir");
        System.out.println(sb1.compareTo(sb3));
    /*
        CompareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamen ayni ise ==> 0 döner
        farklilik varsa ==> ilk farkli harfi buldugunda, farkli harflerin arasinda kac harf oldugunu verir
         */
    }
}
