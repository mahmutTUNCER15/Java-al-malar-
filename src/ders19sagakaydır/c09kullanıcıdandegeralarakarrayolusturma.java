package ders19sagakaydır;

import java.util.Scanner;

public class c09kullanıcıdandegeralarakarrayolusturma {
    public static void main(String[] args) {
        //kullanıcıdan ıstedıgı kadar sayı alıp bır array olusturn
        //kullanıcı eleman gırısını bıtırmek ıcın 0 a bassın

        Scanner scan=new Scanner(System.in);
        int[] arr={0};
        int gırılensayı=0;

        do {
            System.out.println("array'a eklemek ıcın bır tam sayı gırınız"+
                    "\nbıtırmek ıcın 0 a basın");
            gırılensayı=scan.nextInt();
            if (arr[0]==0){
                arr[0]=gırılensayı;

            //}else if (){
                //arr==
            }


        }while (gırılensayı!=0);


    }
}
