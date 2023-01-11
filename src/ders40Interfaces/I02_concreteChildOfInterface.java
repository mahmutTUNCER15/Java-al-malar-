package ders40Interfaces;

public enum I02_concreteChildOfInterface implements I01_Interface{
    ;
//Bir class'ı bir interface'in chıld'ı yapmak için ipmlements keyword kullanılır.

public static void main(String[] args) {
    System.out.println(MESAJ);
    //SAYI=20;
    System.out.println(Integer .MAX_VALUE);
    //normlade variable ısımlerı kucuk harfle baslar ve camecase kullanılır
    //ancak java da ortak kabul olarak
    // satatıc ve final olarak işaretlenen veriable isimlerı tamamen buyuk harf ıle yazılır

    System.out.println(Math.PI);
}

    @Override
    public Void method1() {
        return null;
    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
