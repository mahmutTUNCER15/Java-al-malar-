package ders11stringmanipılation;

public class c02replace {

    public static void main(String[] args) {

        String str= "Java candır";
        System.out.println(str.replace('a','A'));
        System.out.println(str.replace(' ','_'));
        System.out.println(str.replace("candır","cok guzeldır"));
        System.out.println(str.replace(" ",""));

        System.out.println(str.replace("a",""));
        //java yerıne hava cok guzeldır yazdrın
        System.out.println(str.replace("java","hava").replace("candır","cok guzeldır"));

        System.out.println(str.replace("","_"));

        // sadece 1.a'yı A yapın
        System.out.println(str.replaceFirst("a","A"));








    }


}
