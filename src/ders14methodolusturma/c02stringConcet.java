package ders14methodolusturma;

import java.util.Scanner;

public class c02stringConcet {
    public static void main(String[] args) {
        // verilen iki String'i parametre olarak kabul edip
// bu iki String'i aralarinda bir bosluk olan tek bir String olarak
// main method'a donduren bir method olusturun
        Scanner scan =new Scanner(System.in);
        String str1="java";
        String str2="candır";
        System.out.println(birleştirMethod(str1,str2));
        System.out.println(birleştirMethod("bu da","oldu"));
        System.out.println(birleştirMethod("anladınız","mı"));


    }

public static String birleştirMethod(String str1,String str2){
        return str1+" "+ str2;
}
}
