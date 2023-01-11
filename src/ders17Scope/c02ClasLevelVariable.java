package ders17Scope;

public class c02ClasLevelVariable {
   // clas level variableler method ların dısında olusturulur.
    //genel kullanım en  uste olusturulmalarıdır
    static String hastaneİsmi="yıldız hastanesi";
    static int hastasayısı=23453;
    static  String basHekımIsmı;
    String persIsmi;
    String persTelefonu;
    int  persYası;

    public static void main(String[] args) {
        System.out.println("hastaneİsmi");//yıldız hastanesi
        System.out.println("basHekımIsmı");
        System.out.println("persIsmi");
        /*clas level variabler'a deger ataması  yapılmamıs olursa java 0bu variable'lara
        data turune göre defoult olarak tanımlanan degerlerı atar
sayısal variabla'ler ıcın 0'dır
 boolen için folse
cahar için" "
ojeler için null
         */
    }
    public static void method1(){
        System.out.println("hasta sayısı");
        hastasayısı++;
        System.out.println("persIsmi");

    }
    public void method2(){
        System.out.println("hastaneİsmi");//yıldız hastenesi
        hastasayısı++;
        System.out.println("persIsmi");
        System.out.println("persYası");

    }
}
