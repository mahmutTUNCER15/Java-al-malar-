package ders28Varargs_StrıngBuilder;

public class c01Varargs {
    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
    }

    private static void topla(int sayı1, int sayı2, int sayı3, int sayı4) {
        System.out.println("4 sayının toplamı:"+(sayı1+sayı2+sayı3+sayı4));
    }

    public static void topla(int sayı1, int sayı2, int sayı3) {
        System.out.println("3 sayının toplamı:"+(sayı1+sayı2+sayı3));
    }

    private static void topla(int sayı1, int sayı2) {

        System.out.println("2 sayının toplamı:"+(sayı1+sayı2));
    }
}
