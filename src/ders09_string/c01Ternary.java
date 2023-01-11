package ders09_string;

import java.util.Scanner;

public class c01Ternary {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3="Alı";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.equalsIgnoreCase("ali Can"));

    }
}
