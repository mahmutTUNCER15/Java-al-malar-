package ders33ınheritanceDatetypKullanımı_Orevvıd;

public class FAvcıKuşlar extends EKuşlar{
    protected void hareket(){
        System.out.println("Avcu kuşlar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avcı kuşlar et yerler");
    }
    public void pence(){
        System.out.println("Avcı kuşlar pencelidir");
    }
    public void gaga(){
        System.out.println("Avcı kuşlar sıvrı gagalıdır");


    }

    public static void main(String[] args) {

        FAvcıKuşlar avcı1=new FAvcıKuşlar();

        avcı1.beslenme();
        avcı1.gaga();
        avcı1.pence();
        avcı1.hareket();
        avcı1.cogalma();
        avcı1.kanat();
        avcı1.omur();
        avcı1.solunum();

        EKuşlar avcı2=new FAvcıKuşlar();
        /*
          Bir obje oluşturulurken data türü ile constructor farklı ise hangi method'un
        geçerli olacağını bulmak için önce data türünün olduğu class
        ve parent'larına bakarak o method'u buluruz
        bulamaz isek CTE verir ,
        bulurisek HEMEN ÇALIŞTIRMAYIZ
        çalıştırmadan önce o method override edilmiş mi diye control ederiz
        override edilmiş ise override eden method'u calıştırırız.
         */
        avcı2.beslenme();
        avcı2.gaga();
       // avcı2.pence();
        avcı2.hareket();
        avcı2.cogalma();
        avcı2.kanat();
        avcı2.omur();
        avcı2.solunum();

        DHayvanlar avcı3=new FAvcıKuşlar();
        avcı3.beslenme();
        //avcı3.gaga();CTE
        //avcı3.pence();CTE
        avcı3.hareket();
        avcı3.cogalma();
        //avcı3.kanat();CTE
        avcı3.omur();
        avcı3.solunum();

        EKuşlar kus1=new EKuşlar();

        kus1.cogalma();
        kus1.gaga();
        kus1.kanat();
        kus1.hareket();
        kus1.solunum();
        kus1.beslenme();
        kus1.omur();
        /* METHOD'larla belirlenen özellikler
        en güncel bilgiyi bulurken veriable' ile belirlenen özellikler ilk buldugu degeri kullanır.
        bunun için METHOD'lara DİNAMİK , VERIABLE'lalara STATİK  Özelliklidir
         */
        DHayvanlar kus2=new EKuşlar();
        kus2.cogalma();
        //kus2.gaga();CTE
        //kus2.kanat();CTE
        kus2.hareket();
        kus2.solunum();
        kus2.beslenme();
        kus2.omur();

    }
}
