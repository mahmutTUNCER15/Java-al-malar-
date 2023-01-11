package ders16do_Whileloop;

public class c04DoWhile {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        // Ornek : input : 16, output: 4

        int imput=55;
        int baslangıc=1;
        int bayrak=0;



        do {
            if (baslangıc*baslangıc==imput){
                System.out.println("ture");
                bayrak++;
                break;
            }
            baslangıc++;
        }while (baslangıc*baslangıc<=imput);
        if (bayrak==0){
            System.out.println("folse");
        }
    }
}
