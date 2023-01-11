package ders33ınheritanceDatetypKullanımı_Orevvıd;

public class Corolla extends BToyota{
    String model="Corolla";
    String uretimYeri="Türkiye";
    int yıl=2013;

    public static void main(String[] args) {
/*
          Bir obje olusturulurken
          data turu ve constructor ayni class'dan ise
          bir VARIABLE'in degerini bulmak icin
          o class'a gideriz
          o class'da yoksa sirasiyla parent class'lara bakilir
          ilk bulunan kullanilir
         */
        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model);
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.yıl);
        System.out.println(corolla1.marka);
        System.out.println(corolla1.motor);
        System.out.println(corolla1.plaka);
        System.out.println(corolla1.yakit);

        BToyota corolla2=new Corolla();
/* Obje oluşturulurken data türü ve constructor farklı ise
        VARIABLE değerini bulmak için data türü olan class'a
        gidilir . Varsa kullanılır , yoksa o class'ın parentlerıne bakılır
        bulunamaz ise CTE verir ( ama geri vites yapmaz)
         */
        System.out.println(corolla2.model);
      //  System.out.println(( corolla2).uretimYeri);
        System.out.println(corolla2.yil);
        System.out.println(corolla2.marka);
        System.out.println(corolla2.motor);
        System.out.println(corolla2.plaka);
        System.out.println(corolla2.yakit);

        Araba corolla3=new Corolla();

        //System.out.println(corolla3.model);
        //System.out.println(( corolla3).uretimYeri);
        //System.out.println(corolla3.yil);
       // System.out.println(corolla3.marka);
        System.out.println(corolla3.motor);
        System.out.println(corolla3.plaka);
        System.out.println(corolla3.yakit);

        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka);
        System.out.println(toyota1.model);
        System.out.println(toyota1.motor);
        System.out.println(toyota1.plaka);
        System.out.println(toyota1.yil);
        System.out.println(toyota1.yakit);

        Araba toyota2=new BToyota();
        //System.out.println(toyota2.marka);
       // System.out.println(toyota2.model);
        System.out.println(toyota2.motor);
        System.out.println(toyota2.plaka);
       // System.out.println(toyota2.yil);
        System.out.println(toyota2.yakit);

        Araba araba=new Araba();
        System.out.println(araba.motor);
        System.out.println(araba.plaka);
        System.out.println(araba.yakit);
}

}
