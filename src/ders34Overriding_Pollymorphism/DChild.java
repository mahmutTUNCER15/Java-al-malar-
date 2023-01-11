package ders34Overriding_Pollymorphism;

public class DChild extends CParent{

    public void method1(){
/* Overriding kuralları
    1- access modifier method signature'a dail olmadığından
     overridden ve overriding access modifier 'lar farklı olabilir
     chıld parent'i sınırlandıramaz
     yani overriding method'un access modifier'i aynı veya daha geniş kapsamlı olmalı

 */
    }
public static void method2(){
/*
 2- Private ve static method'lar override edilemez
     aynı isimde method olusurulunca java CTE vermez
     ancak override işareti çıkmaz ve @Override notasyonu kullanılmak istenirse CTE olur.
     Yani java bunları farklı class'lardaki farklı method'lar olarak kabul eder.
 */
}
private void method3(){
        /*
        3- Return type method signature'ına dahil olmadığından farklı seçilebilir,
      ancak return type void veya primative ise  aynı olmak zorundadır.
      Eğer return type'lar non-primitive ise , child class'daki return type,
      parent class'daki return type'i ile aynı veya chıld'ı olmalıdır.
         */
}
public void method4(){

}
public Integer method5(){
        return 5;
}
}
