package ders35Exceptions;

public class c02ArithmaticException {
    public static void main(String[] args) {
        //verılen ıkı tam sayıyı bırbırıne bolup sonucun
        // tam sdayı kısmını yazdırın

        int sayı1=20;

        int sayı2=0;

        try {
            //rısklı oldugunu gordugumuz kodlar
            System.out.println(sayı1/sayı2);

        } catch (ArithmeticException e) {
//catch (Exception e) öngordugumuz rısk
            //throw new RuntimeException(e);
            System.out.println("sayı sıfıra bolunmez");

        }


    }
}
