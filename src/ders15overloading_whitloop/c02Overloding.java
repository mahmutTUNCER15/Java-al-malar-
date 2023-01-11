package ders15overloading_whitloop;

public class c02Overloding {
    public static void main(String[] args) {
        çarpım(3,5);// method coll sırasında method parantezıne argument denir
        çarpım(3.4,2);
    }
    //bir clas'aynı isme ve aynı siğnater'a sahıp ıkı method olmaz
    public static void çarpım(int sayı1,int sayı2){
        System.out.println("ıkı integer sayının carpımı:"+sayı1*sayı2);
    }
    public static void çarpım(int sayı3,int sayı4,int sayı5){
        System.out.println("ıkı integer sayının carpımı:"+sayı3*sayı4*sayı5);
}
    public static void çarpım(double sayı1,int sayı2){
        System.out.println("üç integer sayının carpımı:"+sayı1*sayı2);
    }
    public static void çarpım(int sayı1, double sayı2){
        System.out.println("ıkı igneter sayının carpımı:"+sayı1*sayı2);
    }
    public static void çarpım(double sayı1, double sayı2){
        System.out.println("ıkı igneter sayının carpımı:"+sayı1*sayı2);
}
}
