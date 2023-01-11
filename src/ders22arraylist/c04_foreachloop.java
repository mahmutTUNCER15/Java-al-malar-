package ders22arraylist;

public class c04_foreachloop {
    public static void main(String[] args) {
        int[]arr={3,5,7,8,4,2,6,9,6,4,5};
        //bu array dekı 5 den buyuk olan tum elementlerı toplayalım
int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > 5) {

                toplam += arr[i];

            }
        }
        System.out.println("for lopp ile :"+toplam);

        // for each lopp basıt bır kurgu ıle calısr
        //for each loop a 3 seyı soylememız lazım
        //hangı data turunde degıskenlerle ugrasacaksınız
        // loop ıcersınde her bır eleman geldgınde hangı ısımle ışlem yapacaksınız
        //hangı array veya collentıon dan eleman gelecek

        toplam=0;

        for (int each:arr
             ) {
            if (each>5){
                toplam+=each;
            }
        }
        System.out.println("for each loop ıle toplam:"+toplam);
    }
}
