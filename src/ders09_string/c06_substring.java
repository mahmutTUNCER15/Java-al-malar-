package ders09_string;

public class c06_substring {
    public static void main(String[] args) {

        String str= "Java ögren isi kap";

        System.out.println(str.substring(5));//ögren isi kap
        System.out.println(str.substring(0)); // hepsı

        System.out.println(str.length());
        //son karakterı string olarak yaızınız.
        System.out.println(str.charAt(str.length())-1);

        //sonharf=str.substring(str.length()-1);
        System.out.println("sonHarf");// p

        //son indexdeki karakteri upper case olarak yazdırın
        System.out.println(str.substring(str.length()-1).toUpperCase());


        System.out.println(str.substring(str.length()-3).toUpperCase());


    }
}
