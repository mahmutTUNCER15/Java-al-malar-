package ders34Overriding_Pollymorphism;

public class BChild extends Aparent{

    public void method1(){
        System.out.println("parent class method1");

    }
    public void method2(int a){
        System.out.println("child class method 2");
    }
    public void method2(String isim){
        System.out.println("child class String parametrelı classs");
    }

    @Override
    public void method3() {
       // super.method3();
        // Overriding varsa parent ve chıld class'daki
        // overridden ve overriding method'lardan sadece biri calışır
        //Eger ıkısını bırden calıstırmak ıstersenız super.overriddenMethodIsmi yazılır
        /*
        Overriding method @ override notasyonu ile işaretlenebilir
         */
    }
}
