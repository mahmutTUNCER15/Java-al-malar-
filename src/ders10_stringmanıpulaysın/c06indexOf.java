package ders10_stringmanıpulaysın;

public class c06indexOf {
    public static void main(String[] args) {
        String str ="Ahmet hoca ile hersey claer";

        System.out.println(str.indexOf("a"));


        System.out.println(str.indexOf("c"));

        System.out.println(str.indexOf("hersey"));

        System.out.println(str.indexOf("e",9));

        System.out.println(str.indexOf("e",14));
        // cümlede kı 2. c' index'ını yazdırın.

        int ilkcindex= str.indexOf("c");

        System.out.println(str.indexOf("c",ilkcindex+1));


        System.out.println(str.indexOf("ali"));// index olarak döndürmesi bekleniyor.

        System.out.println(str.indexOf("x"));
    }
}
