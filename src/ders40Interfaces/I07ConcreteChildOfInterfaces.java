package ders40Interfaces;

/*//public class I07ConcreteChildOfInterfaces extends I05_Interface implements I06_Interface{

    @Override
    Void method1() {
        return super.method1();
    }

    @Override
    int method2() {
        return super.method2();
    }

    @Override
    int method4() {
        return super.method4();
    }

    @Override
    String method3() {
        return super.method3();
    }
}
*/
 /*
   1 Bir  class sadece bir class'a extends edilebilir
   ANCAK birden fazla interface'e implements edilebilir.

   2-Concrete child class implement ettigi tüm interface'lerdeki abstract methodları
   override etmek zorunda  olduğundan iki interface'deki tüm methodları override etmek gerekir.
   - İki interface'de aynı isimde ve aynı return type sahip method'lardan hangisini override ettiği
   önemli değildir.
   - ancak isimler aynı return type'lar farklı oldugundan  iki interface'i birden implement etmemiz
   mümkğn olmayacaktır
        *) ya chıld class'dan bu iki interface'i implement etmekten vazgecmelisiniz
        *) veya sisteme müdahale imkanınız varsa bu conlict(karısıklık)'ı çözmelisiniz.

    3- Chıld class'dan parent interface'lerdeki veriable'ları kullanmak istersek
       * AYNI İsimde iki interface'de de veriable varsa tercihinizi belirtmelisiniz.
       interfaceIsmi.veriableIsmi seklinde tercihinizi belirtmelisiniz
       Kullancagımız veriable sadece bir interface'de varsa
       sadece veriable ismini yazmak yeterli olacaktır.
       //I07 I05 ve I06 interface'lerini implements ettiginde conflict olustugu için return type String yaptık

    */