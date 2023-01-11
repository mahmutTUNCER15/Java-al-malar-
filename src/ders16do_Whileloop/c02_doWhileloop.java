package ders16do_Whileloop;

public class c02_doWhileloop {
    public static void main(String[] args) {
        //10,11,12 sayılarını toplayan bır whıle loop oluşturalım.
        int sayı=10;
        int toplam=0;

        do {
            toplam=toplam+sayı;
            sayı++;

        }while (sayı<=12);
        // do Whıle loop un ıkı avantajı vardır.
        //1_loop bady'sı en azbır kere calısır.
        //2- Whıle bıtış kontrolu loop kadar calısır.
    }
}
