package ders40Interfaces;

public interface I01_Interface {
    /* Interface'ler özel yapı olduklarından yazılsa da yazılmasa da , tüm veriable'lar
        public static ve final'dir.*/
String MESAJ="Hello ınterface";
static int SAYI=20;
public static boolean GUZEL_MI=true;
public static final int SAYI2=30;

//aynı sekılde
    //tum methodlar publıc ve absrat dır
Void method1();
    abstract int method2();
public abstract String method3();
}
