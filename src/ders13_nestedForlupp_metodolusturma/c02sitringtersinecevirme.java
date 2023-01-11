package ders13_nestedForlupp_metodolusturma;

public class c02sitringtersinecevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String imput="java her gecen gun guzelleşiyor";
        String tersimput="";

        for (int i = imput.length()-1; i >=0; i--) {

            tersimput+=imput.substring(i,i+1);

        }
        System.out.println("ters hali:"+ tersimput);

    }
}
