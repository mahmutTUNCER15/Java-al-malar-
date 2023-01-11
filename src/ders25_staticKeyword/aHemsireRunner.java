package ders25_staticKeyword;

public class aHemsireRunner {
    public static void main(String[] args) {

        AHemşire h1=new AHemşire();
        h1.personelismi="ayse";
        h1.personelAdresi="ulus";
        h1.personeltelefonu="02124574085";

        AHemşire h2=new AHemşire();
        System.out.println(h1);

        h2.personelismi="hatice";
        h2.personeltelefonu="2124657845";
        h2.personelAdresi="sincan";
        AHemşire.basHekımismı="yasarkemal";

        System.out.println("h1:"+h1);
        System.out.println("h2:"+h2);

        AHemşire h3=new AHemşire();

        System.out.println("h3:"+h3);



    }
}
