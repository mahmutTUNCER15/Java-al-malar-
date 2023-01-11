package ders19sagakaydır;

import java.util.Arrays;

public class c05sstrinsplıtmethodu {
    public static void main(String[] args) {

        String str="java gercekten cok cok guzel";
        // verılen sıtrıngde kac tane e harfı oldugunu bulunuz

        String[]eArrayı=str.split("e");
        System.out.println(Arrays.toString(eArrayı));
        System.out.println(eArrayı.length);
        System.out.println("metınde 'e sayısı:"+(eArrayı.length-1));


        //2.yöntem
        //strıngı "" ıle splıt yaparak karak
        String[]tumKarakterlerArr=str.split("0");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        int sayaç=0;
        //bır loop ıle tum karakterlerı kontroledelım
        for (int i = 0; i <tumKarakterlerArr.length ; i++) {
            if (tumKarakterlerArr[i].equals("e")){
                sayaç++;
            }
            System.out.println("metın dekı e sayısı");
        }
    }
}
