package day5;

public class c04topZıplamaSorusu {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
        double yukseklık=200;
        double topunToplamYolu=0;
        int yereVurmaSayısı=0;
        do {
            yereVurmaSayısı++;
            topunToplamYolu+=yukseklık;
            yukseklık*=0.75;
            topunToplamYolu+=yukseklık;
        }while (yukseklık>=100);
        System.out.println("topun yere vurma sayısı="+yereVurmaSayısı+"topun kat ettiğini toplam yol="+topunToplamYolu);

    }
}
