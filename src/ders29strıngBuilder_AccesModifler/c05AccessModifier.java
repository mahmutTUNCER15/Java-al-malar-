package ders29strıngBuilder_AccesModifler;

public class c05AccessModifier {
    public static void main(String[] args) {

        c04accesModifiers obj=new c04accesModifiers();

        obj.isim="tugay";
        System.out.println(obj.isim);

        c04accesModifiers obj2=new c04accesModifiers();
        System.out.println(obj2.isim);
    }
}
