package ders09_string;

public class c05lenth {
    public static void main(String[] args) {
        String str= "Uzunkavaklaraltındayataruyumazoglu";

        System.out.println(str.length());//34
        System.out.println(str.charAt(33));//u

        System.out.println(str.charAt(str.length()-1));

        // sondan 3. karateri yazdır
        System.out.println(str.charAt((str.length()-3)));





    }
}
