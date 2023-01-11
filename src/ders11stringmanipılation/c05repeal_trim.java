package ders11stringmanipılation;

public class c05repeal_trim {

    public static void main(String[] args) {
       String str="Java  güzeldir\n";

        System.out.println(str.repeat(4));

        str= "  Java güzeldir";
        System.out.println(str.length());

        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());




    }

}
