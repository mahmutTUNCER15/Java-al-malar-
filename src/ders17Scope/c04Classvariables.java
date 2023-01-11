package ders17Scope;

public class c04Classvariables {
    public static void main(String[] args) {
        //c03 dekı hastane ısmını yazdırmak ıstıyoruz?
        System.out.println(c03Objekvariables.hastaneİsmi);

        System.out.println(c03Objekvariables.hastasayısı);

        c03Objekvariables.hastasayısı++;
        c03Objekvariables.hastasayısı++;
        methot1();
        System.out.println(c03Objekvariables.hastasayısı);
    } // kod takıbı maın method dan baslar maın methotun sonuna geldıgınde bıter.
    //tum degerler resetlenır variable degerleri bastakı hallerıne döner
    public static void methot1(){
        c03Objekvariables.hastasayısı++;

    }
}
//java runtıme bır programdır.
//calısmaya basladıgında variable'lara atnan degerleri işler
//calıstıgı muddetce yapılan degısıklıklerı kaydeder.
// Ama calısması bıttıgınde degısen degerler artık gıder resetlenır.