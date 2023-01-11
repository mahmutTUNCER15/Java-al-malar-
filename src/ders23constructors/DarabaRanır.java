package ders23constructors;

public class DarabaRanır {
    public static void main(String[] args) {

        Daraba arb1=new Daraba();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakıt);
        System.out.println(arb1.yıl);
        System.out.println(arb1.fıyat);

        arb1.model="1991";
        arb1.marka="tofaş";
        arb1.yakıt="benzın";
        arb1.fıyat=5000;
        arb1.yıl=1991;

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakıt);
        System.out.println(arb1.yıl);
        System.out.println(arb1.fıyat);
        System.out.println(arb1.maxHız(arb1.yakıt));


        Daraba arb2=new Daraba();
        System.out.println("marka:"+arb2.marka+
                "\nmodel:"+arb2.model+
                "\nyakıt"+arb2.yakıt+
                "\nyıl:"+arb2.yıl+
                "\nfiyat:"+arb2.fıyat);

        Daraba arb3=new Daraba();

        System.out.println(arb3);

        System.out.println(arb1);

    }
}
