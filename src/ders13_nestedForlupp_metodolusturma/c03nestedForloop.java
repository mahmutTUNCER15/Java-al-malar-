package ders13_nestedForlupp_metodolusturma;

public class c03nestedForloop {
    public static void main(String[] args) {

        //1-4 arsındakı  sayılar carpım taplosu olusturun.
        // dis döngu satırları kontrol eder
        for (int i = 1; i <=4 ; i++) {

            //iç döngu olusturalım
            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j+ " ");

            }
            //iç döngu bittiğindda javayı altsatıra indirmelıyız
            System.out.println(" ");
        }

    }

}
