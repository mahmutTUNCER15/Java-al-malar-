package ders27immutableClass_DateAndTime;

public class c02Syringpool {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";

        String str3=new String("java");

        String str4="";
        str4=str4.concat("java");

        String str5="ja";

        String str=str5.concat("va");

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);

        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);

        System.out.println(str1.equals(str4));
        System.out.println(str1==str4);

        System.out.println(str1.equals(str5));
        System.out.println(str1==str5);

        System.out.println(str1=="java");
        System.out.println(str3=="java");
    }
}
