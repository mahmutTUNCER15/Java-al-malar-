package ders40Interfaces;

public interface I08_InterfaceStaticVeDefauldMethod {
    /* Java 8 ile developer'ların talabi üzerine yeni bir istisnai durum java'ya eklenmiştir
     bir isterface'i yıllar içerisinde yüzlerce class inherit etmiş olabilir.
     sonradan Interface'e eklenen bir abstract method tüm eski child'lar tarafından inherit
     edilmelidir. Aksi takdirde tüm eski child class'lar CTE verecektir

     Java 8 ile birlikte Java Interface'lere default ve static ile işaretlenmek şartı ile
     body'si olan method eklenmesine izin vermiştir.
      */
    void method1();
    void method2();


    void method();

    public default void method3(){
        System.out.println("ınterface icibde bady olan method");
    }
    public static void method4(){

    }
}

