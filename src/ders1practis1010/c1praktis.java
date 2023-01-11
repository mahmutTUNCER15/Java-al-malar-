package ders1practis1010;

public class c1praktis {
    public static void main(String[] args) {

    int sayı=34526;

    int birler=sayı%10;
    int onlar=(sayı/10)%10;
    int yüzer=(sayı/100)%10;
    int binler=(sayı/1000)%10;
    int onbinler=(sayı/10000)%10;

        System.out.println(onbinler + "\n" + binler + "\n" + yüzer + "\n" + onlar +"\n" + birler);



    }
}
