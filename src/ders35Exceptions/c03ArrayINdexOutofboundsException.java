package ders35Exceptions;

import java.util.Scanner;

public class c03ArrayINdexOutofboundsException {
    public static void main(String[] args) {

        int[] arr={3,4,6,7,8,2,3,5,6,8,9,1};

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bır ındex gırınız");

        int index=scan.nextInt();

        try {

            System.out.println(arr[index]);

        } catch (ArithmeticException hata) {

            System.out.println(hata.getMessage());

           hata.printStackTrace();
        }

    }
}
