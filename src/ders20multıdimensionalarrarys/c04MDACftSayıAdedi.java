package ders20multıdimensionalarrarys;

public class c04MDACftSayıAdedi {
    public static void main(String[] args) {
        //verılen ıkı katlı int array dekı cıft sayı adedını bulan kod yazınız
        int[][]arr={{4,6},{3,5,8},{1,0,4}};
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] %2==0);
                sayac++;

            }

        }

        System.out.println("array dekı cıft sayı adedı:"+sayac);
    }
}
