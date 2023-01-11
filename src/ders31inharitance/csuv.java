package ders31inharitance;

public class csuv extends BinekArac{

    public static void main(String[] args) {

        csuv suv1=new csuv();

        System.out.println(suv1.marka);

        System.out.println(suv1.model);

        System.out.println(suv1.motor);

        System.out.println(suv1.plaka);

        System.out.println(suv1.yakıt);

        System.out.println(suv1.yıl);

        suv1.hız();

        suv1.teker();

        csuv suv2=new csuv();

        suv2.marka="toyota";
        suv2.model="RAV4";
        suv2.motor="1,6";
        suv2.plaka="06 ANKA 006";
        suv2.yakıt="benzın";
        suv2.yıl=2012;
        suv2.hız(suv2.yakıt);



    }
    public void hız(String yakıt){
        if (yakıt.equalsIgnoreCase("bnezin")){
            System.out.println("bnezınlı suv lar 360 max km hız yapar");

        } else if (yakıt.equalsIgnoreCase("dizel")) {
            System.out.println("dızel SUV ler max260 km hız yapar");

        } else if (yakıt.equalsIgnoreCase("hıbrıt")) {
            System.out.println("HIBRIT SUV LAR MAX 220 KM YAPAR");

        } else  {
            System.out.println("yakıt bellı degıl max hız yapar");

        }
    }
}
