package ders12_Forloops;

public class cdükkatınıkapat {
    public static void main(String[] args) {
        int sayı=5300;
        int bayrak=0;

        for (int i = 2; i <sayı-1 ; i++) {
            if (sayı% i==0){
                //askımız bıttı
             bayrak++;
break;
            }
        }
        System.out.println(bayrak);

if (bayrak==0);{
        System.out.println("asal sayı");
        }  {
            System.out.println("asal sayı degil");
        }
}
}